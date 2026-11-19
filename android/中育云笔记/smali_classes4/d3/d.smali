.class public final synthetic Ld3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/FloatWindowService;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/FloatWindowService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/d;->c:Lcom/friday/lecture/floatwindow/FloatWindowService;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/d;->c:Lcom/friday/lecture/floatwindow/FloatWindowService;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/FloatWindowService;->d(Lcom/friday/lecture/floatwindow/FloatWindowService;Ljava/lang/Object;)V

    return-void
.end method
