package com.sda.mvc.controller;

import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.view.GiantView;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class GiantControllerTest {

    @Test
    void setHealth() {
        final GiantView view = mock(GiantView.class);
        final GiantModel model = mock(GiantModel.class);
        final GiantController controller = new GiantController(model, view);

        verifyZeroInteractions(view, model);
        for(Health health : Health.values()) {
            controller.setHealth(health);
            verify(model).setHealth(health);
        }
    }

}
