# custom-annotaion-example
This project clearly shows how to build custom annotation and use it another spring boot apps


# steps to connect DB via custome annotation:

# Step 1: create custom anootation in common library say DYnamicDatasourse project
# step 2: have AOP (Spring Aspect) based conenctions to play with context loading during bean creation and expose the scope to PROTOTYPE
# step 3: clean and install/mount your library to different SPRING BOOT ONLY / SPRING projects in the form of maven reporsitory or importing module
# step 4: ensure to component scan your package in the caller App (CustomAnnotation project)
# step 5: play with code


# Important steps to be notes:

1. ensure to mount the common project properly with no errors in pom file.
