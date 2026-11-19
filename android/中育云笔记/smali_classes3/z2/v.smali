.class public final synthetic Lz2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/viewmodel/ShareBase;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/viewmodel/ShareBase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/v;->c:Lcom/friday/document/viewmodel/ShareBase;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/v;->c:Lcom/friday/document/viewmodel/ShareBase;

    invoke-static {v0}, Lcom/friday/document/viewmodel/ShareBase;->e(Lcom/friday/document/viewmodel/ShareBase;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
