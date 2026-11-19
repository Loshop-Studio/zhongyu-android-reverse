.class public final synthetic Lf3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/homework/b;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/homework/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/q;->c:Lcom/friday/lecture/floatwindow/homework/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf3/q;->c:Lcom/friday/lecture/floatwindow/homework/b;

    invoke-static {v0}, Lcom/friday/lecture/floatwindow/homework/b;->b(Lcom/friday/lecture/floatwindow/homework/b;)Landroid/view/WindowManager;

    move-result-object v0

    return-object v0
.end method
