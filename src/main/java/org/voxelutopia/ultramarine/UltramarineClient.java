package org.voxelutopia.ultramarine;

import net.fabricmc.api.ClientModInitializer;
import org.voxelutopia.ultramarine.client.handler.ModClientEventHandler;

/**
 * Name: Ultramarine / UltramarineClient
 * Author: cnlimiter
 * CreateTime: 2023/10/3 11:00
 * Description:
 */

public class UltramarineClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModClientEventHandler.onClientSetup();
    }
}
