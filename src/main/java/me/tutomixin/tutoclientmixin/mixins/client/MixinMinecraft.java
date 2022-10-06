package me.tutomixin.tutoclientmixin.mixins.client;

import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.Minecraft;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    /*@Inject(method = "createDisplay", at = @At("RETURN"))
    public void createDisplay(CallbackInfo callbackInfo) {
    	String name = "Lone Client 4auI8a-1.3";
    	String version = "Minecraft 1.8.9-stable-pvp";
    	String fName = name + " | " + version;
        Display.setTitle(fName);
    }
	
	@ModifyArg(method = "createDisplay", at = @At(
	        value = "INVOKE",
	        target = "setTitle()V",
	        ordinal = 1),
	       index = 0)*/
	@ModifyArg(method = "createDisplay", at = @At(value = "INVOKE", ordinal = 1),index = 0)
	private String modifyOutput(String x) {
		String name = "Lone Client 4auI8a-1.3";
    	String version = "Minecraft 1.8.9-stable-pvp";
    	String fName = name + " | " + version;
		return fName;
	}
}
