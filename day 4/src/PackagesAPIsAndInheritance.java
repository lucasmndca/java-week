import constants.Constants; //Imports constant messages
import gpu.Amd;
import gpu.Nvidia;

import java.util.Scanner; //Imports the Scanner class, which reads whatever our users input

public class PackagesAPIsAndInheritance { //Let's have some fun with packages tonight!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.GPU_GET_BRAND);
        try {
            String brand = scanner.nextLine();
            Object gpuInfo = setGpuBasedOnBrand(scanner, brand);
            printProcessor(gpuInfo);
        } catch (Exception e) {
            System.out.println(Constants.GPU_GET_BRAND_ERROR);
        }
    }

    //I know this method is huge, but I SO wanna sleep now!
    //TODO: Split into multiple methods as well as print the GPU's price and some other numeric info
    static Object setGpuBasedOnBrand(Scanner scanner, String brand) {
        if(brand.toUpperCase().contains(Constants.GPU_BRAND_AMD)) {

            System.out.println(Constants.GPU_GET_MODEL);
            Amd amdGpu = new Amd();
            amdGpu.setBrand(Constants.GPU_BRAND_AMD);
            amdGpu.setModel(scanner.nextLine());

            System.out.println(Constants.GPU_GET_MEMORY_CAPACITY);
            amdGpu.setMemoryCapacity(scanner.nextByte());

            System.out.println(Constants.GPU_GET_NUMBER_OF_COOLERS);
            amdGpu.setNumberOfCoolers(scanner.nextByte());

            System.out.println(Constants.GPU_GET_PRICE);
            amdGpu.setPrice(scanner.nextFloat());

            String[] amdGpuInfo = {amdGpu.getBrand(),amdGpu.getModel()};

            return amdGpu;
        } else {

            System.out.println(Constants.GPU_GET_MODEL);
            Nvidia nvidiaGpu = new Nvidia();

            nvidiaGpu.setBrand(Constants.GPU_BRAND_NVIDIA);
            nvidiaGpu.setModel(scanner.nextLine());

            System.out.println(Constants.GPU_GET_MEMORY_CAPACITY);
            nvidiaGpu.setMemoryCapacity(scanner.nextByte());

            System.out.println(Constants.GPU_GET_NUMBER_OF_COOLERS);
            nvidiaGpu.setNumberOfCoolers(scanner.nextByte());

            System.out.println(Constants.GPU_GET_PRICE);
            nvidiaGpu.setPrice(scanner.nextFloat());

            String[] nvidiaInfo = {nvidiaGpu.getBrand(),nvidiaGpu.getModel()};

            return nvidiaGpu;
        }
    }

    static void printProcessor(Object gpuInfo) {
        System.out.println(Constants.GPU_GET_RESULTS_BRAND + "");
        System.out.println(Constants.GPU_GET_RESULTS_MODEL + "");
    }
}
