.class public Lcom/jaredrummler/android/colorpicker/a$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/a$b;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/jaredrummler/android/colorpicker/a$b;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/a$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b$b;->c:Lcom/jaredrummler/android/colorpicker/a$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b$b;->c:Lcom/jaredrummler/android/colorpicker/a$b;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/a$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1
.end method
