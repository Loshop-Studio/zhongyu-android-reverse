.class public final synthetic Le3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/d;->c:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le3/d;->c:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->f(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Landroid/view/View;)V

    return-void
.end method
