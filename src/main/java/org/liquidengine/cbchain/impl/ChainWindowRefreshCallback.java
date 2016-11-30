package org.liquidengine.cbchain.impl;

import org.liquidengine.cbchain.AbstractChainCallback;
import org.liquidengine.cbchain.IChainWindowRefreshCallback;
import org.lwjgl.glfw.GLFWWindowRefreshCallbackI;

/**
 * Created by Shcherbin Alexander on 6/8/2016.
 */
public final class ChainWindowRefreshCallback extends AbstractChainCallback<GLFWWindowRefreshCallbackI> implements IChainWindowRefreshCallback {
    @Override
    public void invoke(long window) {
        for (GLFWWindowRefreshCallbackI glfwWindowRefreshCallbackI : callbackChain) {
            glfwWindowRefreshCallbackI.invoke(window);
        }
    }
}
