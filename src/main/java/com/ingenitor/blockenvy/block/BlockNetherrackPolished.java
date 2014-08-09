/**
 * 
 */
package com.ingenitor.blockenvy.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.ingenitor.blockenvy.reference.Identity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author ingenitor
 *
 */
public class BlockNetherrackPolished extends TBlock {
    private IIcon blockIconSide;
	/**
	 * 
	 */
	public BlockNetherrackPolished() {
		super("stone_netherrack_smooth");
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
    	super.registerBlockIcons(iconRegister);
    	blockIconSide = iconRegister.registerIcon(Identity.MOD_ID + ":" + "double_stone_netherrack_smooth");
    }
    
    @Override    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_side, int p_meta) {
        return p_meta == 0 ? this.blockIcon : (p_side != 1 && p_side != 0) ? this.blockIconSide : this.blockIcon;
    }
}