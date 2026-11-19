.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$c;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$c;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    iget p2, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:I

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
