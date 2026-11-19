.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field public final synthetic b:I

.field public final synthetic c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;Lcom/jaredrummler/android/colorpicker/ColorPanelView;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;->a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 4
    .line 5
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;->a:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 2
    .line 3
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;->b:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
