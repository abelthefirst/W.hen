package houtbecke.rs.when.robo.condition.event;

import android.app.Fragment;

import houtbecke.rs.when.robo.event.PauseEvent;

public class FragmentResume extends FragmentEvent implements PauseEvent {
    public FragmentResume(Fragment fragment) {
        super(fragment);
    }
}