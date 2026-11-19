.class public final synthetic Lx2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareBaseFileFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/d;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/d;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    check-cast p1, Lcom/friday/document/model/ShareListEntity;

    invoke-static {v0, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->t(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareListEntity;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
