// packages and imports go here

public class FXMain extends Application {
    
    @Override
    public void start(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Music Player FX");
        // music player icon
        Image icon = new Image("C:\\Users\\karla\\Documents\\NetBeansProjects\\MusicPlayer\\src\\images\\music.jpeg");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(new EventHandler<WindowEvent>(){
            @Override
            public void handle(WindowEvent arg0){
                Platform.exit();
                System.exit(0);
            }
        });
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
