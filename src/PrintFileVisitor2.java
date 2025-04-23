import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PrintFileVisitor2 extends SimpleFileVisitor<Path>{
	private int level = 0;
	
	private void printWithIndent(Path path){
		for(int i = 0; i < level; i++){
			System.out.print("         ");
		}
		System.out.println(path.getFileName());
	}
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)throws IOException{
		printWithIndent(dir);
		level++;
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)throws IOException{
		printWithIndent(file);
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException{
		level--;
		return FileVisitResult.CONTINUE;
		
	}
	
	@Override public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException{
		return super.visitFileFailed(file, exc);
	}
}