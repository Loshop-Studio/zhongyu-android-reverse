.class public final synthetic Lcom/friday/document/view/share/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareBaseFileFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/document/view/share/d;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/d;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    invoke-static {v0}, Lcom/friday/document/view/share/ShareBaseFileFragment$handleFileClick$1;->n(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
