package facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("Starting computer...");
        cpu.start();
        memory.load();
        hardDrive.read();
        cpu.execute();
    }

    public void shutdownComputer() {
        System.out.println("Shutting down computer...");
        cpu.shutdown();
        memory.clear();
    }
}
