package Objects.Catalog.AddButton.MVC;

import Objects.Catalog.AddButton.DTO.ButtonDTOs;
import Objects.Catalog.World.MVC.WorldController;
import com.badlogic.gdx.math.Vector2;

public class AddButtonController
{
    private final WorldController worldController;
    private AddButtonModel model;
    private AddButtonView view;

    public AddButtonController(WorldController worldController, Vector2 position)
    {
        this.worldController = worldController;
        config(position);
    }

    private void config(Vector2 position)
    {
        model = newModel(position);
        view = newView();
        AddToWorld();
    }

    private AddButtonModel newModel(Vector2 position)
    {
        return new AddButtonModel(position);
    }
    private AddButtonView newView()
    {
        return new AddButtonView(this, model);
    }

    private void AddToWorld()
    {
        ButtonDTOs.ButtonDTO k = new ButtonDTOs.ButtonDTO(model, view);
        worldController.getModel().addMob(k);
    }

    public void buttonClicked()
    {
        worldController.addButtonClicked();
    }
}
