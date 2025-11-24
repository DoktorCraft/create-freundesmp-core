package ch.dok.cfsmp.block.custom;

import ch.dok.cfsmp.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MechaniumBlock extends Block {
    public MechaniumBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {

        if (pLevel.isClientSide()) {
            pLevel.playLocalSound(pPos.getX(), pPos.getY(), pPos.getZ(),
                    ModSounds.NEED_IRON.get(), SoundSource.BLOCKS, 1f, 1f, false);
        }

        return InteractionResult.SUCCESS;
    }

}