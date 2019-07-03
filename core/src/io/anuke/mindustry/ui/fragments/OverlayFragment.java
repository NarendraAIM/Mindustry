package io.anuke.mindustry.ui.fragments;

import io.anuke.arc.scene.Group;
import io.anuke.arc.scene.event.Touchable;
import io.anuke.arc.scene.ui.layout.WidgetGroup;
import io.anuke.mindustry.input.InputHandler;

/** Fragment for displaying overlays such as block inventories. */
public class OverlayFragment extends Fragment{
    public final BlockInventoryFragment inv;
    public final BlockConfigFragment config;

    private Group group = new WidgetGroup();

    public OverlayFragment(InputHandler input){
        group.touchable(Touchable.childrenOnly);
        inv = new BlockInventoryFragment();
        config = new BlockConfigFragment();
    }

    @Override
    public void build(Group parent){
        group.setFillParent(true);
        parent.addChild(group);

        inv.build(group);
        config.build(group);
    }

    public void remove(){
        group.remove();
    }
}
