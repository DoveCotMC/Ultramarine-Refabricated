package org.voxelutopia.ultramarine.init.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.voxelutopia.ultramarine.init.event.PlayerEvents;

/**
 * Name: Ultramarine / BlockBehaviourMixin
 * Author: cnlimiter
 * CreateTime: 2023/10/3 11:17
 * Description:
 */

@Mixin(BlockBehaviour.class)
public class BlockBehaviourMixin {
    @ModifyExpressionValue(
            method = "getDestroyProgress",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/player/Player;getDestroySpeed(Lnet/minecraft/world/level/block/state/BlockState;)F"
            )
    )
    public float modifyDestroySpeed(float original,
                                    BlockState state, Player player, BlockGetter world, BlockPos pos) {
        return PlayerEvents.BREAK_SPEED.invoker().modifyBreakSpeed(player, state, pos, original);
    }
}
