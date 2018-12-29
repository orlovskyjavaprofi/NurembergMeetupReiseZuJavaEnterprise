package usertype;

public abstract class BirdOfPrey
{
   private String colorOfShipHull;
   private Integer amountOfPhotonTorpedos;
   private Boolean cloakStatus;
   private Integer amountOfPhasers;
   private Boolean selfDistructStatus;
   private Boolean tractorBean;
   private Boolean hyperEngineStatus;
   
   protected abstract void fireAllWeapons();
   protected abstract void fireOnlyPhotonTorpedos();
   protected abstract void fireOnlyPhaserWeapons();
   protected abstract void activateCloak();
   protected abstract void activateTractorBeam();
   protected abstract void activateHyperEngine();   
}
