.class public final synthetic Lx2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareSearchActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareSearchActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/o;->c:Lcom/friday/document/view/share/ShareSearchActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/o;->c:Lcom/friday/document/view/share/ShareSearchActivity;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lcom/friday/document/model/ShareFile;

    invoke-static {v0, p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity;->R(Lcom/friday/document/view/share/ShareSearchActivity;ILcom/friday/document/model/ShareFile;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
