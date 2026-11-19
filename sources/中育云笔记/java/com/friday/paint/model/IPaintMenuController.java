package com.friday.paint.model;

import java.io.File;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface IPaintMenuController {

    public static final class DefaultImpls {
    }

    static /* synthetic */ void addNote$default(IPaintMenuController iPaintMenuController, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNote");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        iPaintMenuController.addNote(i10, str);
    }

    void addNote(int i10, String str);

    void deleteNote(int i10);

    int getNotesCount();

    ArrayList<File> getSavePath();

    void goToNote(int i10, int i11);

    void saveFile();

    void updateFile(int i10);
}
