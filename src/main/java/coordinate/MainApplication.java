package coordinate;

import coordinate.graph.Graph;
import coordinate.io.ConsoleInputHandler;
import coordinate.io.ConsoleOutputHandler;
import coordinate.plot.LinePlot;

public class MainApplication {

    public static void main(String[] args) {
        FigureSize figureSize = inputHandler.getFigureSize();
        Figure figure = FigureFactory.create(figureSize);
        Graph graph = Graph.from(figure);
        outputHandler.printGraph(graph);
    }
}
