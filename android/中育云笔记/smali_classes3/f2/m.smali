.class public final synthetic Lf2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/common/helper/e;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/helper/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/m;->c:Lcom/friday/common/helper/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/m;->c:Lcom/friday/common/helper/e;

    invoke-static {v0}, Lcom/friday/common/helper/e;->b(Lcom/friday/common/helper/e;)Lcom/friday/common/helper/e$c;

    move-result-object v0

    return-object v0
.end method
