Class Utils{

  //draw head
    public static void drawPlayerHead(int x, int y, int width, EntityLivingBase player) {//width and height are the same number so yeah yes aha
    	NetworkPlayerInfo playerInfo = mc.getNetHandler().getPlayerInfo(player.getUniqueID());
    	if (playerInfo != null){
            mc.getTextureManager().bindTexture(playerInfo.getLocationSkin());
            GL11.glColor4f(1F, 1F, 1F, 1F);

            Gui.drawScaledCustomSizeModalRect((int) x - 5, (int) y - 5, 8F, 8F, 8, 8, 20, 20, 64F, 64F);
        }
        
    }
    
    public void drawPlayerHead(int x, int y, int width) {//width and height are the same number so yeah yes aha
    	if(mc.thePlayer != null) {
	    	GlStateManager.pushMatrix();
	        float scale = width / 32;
	        GlStateManager.scale(scale, scale, scale);
	        mc.getTextureManager().bindTexture(mc.thePlayer.getLocationSkin());
	        GL11.glEnable(GL11.GL_BLEND);
	        this.drawTexturedModalRect(x / scale, y / scale, 32, 32, 32, 32);
	        GL11.glDisable(GL11.GL_BLEND);
	        GlStateManager.popMatrix();
    	}
    }
  
}
