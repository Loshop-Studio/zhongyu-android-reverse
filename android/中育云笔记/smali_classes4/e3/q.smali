.class public final synthetic Le3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/canvas/a;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/canvas/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/q;->c:Lcom/friday/lecture/floatwindow/canvas/a;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le3/q;->c:Lcom/friday/lecture/floatwindow/canvas/a;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/canvas/a;->a(Lcom/friday/lecture/floatwindow/canvas/a;Ljava/lang/Object;)V

    return-void
.end method
