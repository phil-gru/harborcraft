package de.philipp.harborcraft.gametest;

import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.gametest.GameTestHolder;

@GameTestHolder("harborcraft")
public class ExampleGameTest {
    
    @GameTest(template = "empty", timeout = 100)
    public static void testBlockPlacement(GameTestHelper helper) {
        // Setze einen Block an Position (1, 1, 1)
        BlockPos pos = new BlockPos(1, 1, 1);
        helper.setBlock(pos, Blocks.STONE.defaultBlockState());
        
        // Überprüfe, dass der Block tatsächlich dort ist
        helper.assertBlockPresent(Blocks.STONE, pos);
        
        // Test erfolgreich
        helper.succeed();
    }
}
