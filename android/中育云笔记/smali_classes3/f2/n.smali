.class public final synthetic Lf2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/common/helper/e;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/helper/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/n;->c:Lcom/friday/common/helper/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/n;->c:Lcom/friday/common/helper/e;

    invoke-static {v0}, Lcom/friday/common/helper/e;->c(Lcom/friday/common/helper/e;)V

    return-void
.end method
