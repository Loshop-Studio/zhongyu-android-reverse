.class public final synthetic Ld3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    invoke-static {p1}, Lcom/friday/lecture/floatwindow/FloatWindowService;->b(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    return-void
.end method
