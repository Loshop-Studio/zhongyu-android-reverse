.class public final synthetic Lx2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareSearchActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareSearchActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/q;->c:Lcom/friday/document/view/share/ShareSearchActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/q;->c:Lcom/friday/document/view/share/ShareSearchActivity;

    check-cast p1, Lcom/friday/document/model/ShareFile;

    invoke-static {v0, p1}, Lcom/friday/document/view/share/ShareSearchActivity;->N(Lcom/friday/document/view/share/ShareSearchActivity;Lcom/friday/document/model/ShareFile;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
