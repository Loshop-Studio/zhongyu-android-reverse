.class public final synthetic Lf3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/f;->c:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lf3/f;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf3/f;->c:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lf3/f;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    invoke-static {v0, v1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->k(Landroid/graphics/Bitmap;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    return-void
.end method
