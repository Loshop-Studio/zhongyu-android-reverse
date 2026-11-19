.class public final synthetic Ly3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/a;->a:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly3/a;->a:Lx7/l;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->d(Lx7/l;)V

    return-void
.end method
