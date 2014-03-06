package houtbecke.rs.when.robo.condition;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import javax.inject.Inject;

import houtbecke.rs.when.BasePushCondition;
import houtbecke.rs.when.robo.condition.event.MenuItemSelect;

public class Selected extends BasePushCondition {
    Bus bus;

    @Inject
    public Selected(Bus bus) {
        bus.register(this);
        this.bus = bus;
    }

    @Subscribe public void onSelected(MenuItemSelect item) {
        eventForThing(item.getObject());
        eventForThing(item.getResourceId());
        eventForThing(item.getSourceClass());
    }


}