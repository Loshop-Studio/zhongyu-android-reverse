.class public final synthetic Lcom/friday/document/view/share/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/friday/document/view/share/b;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/document/view/share/b;->c:I

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment$handleFileClick$1;->m(ILjava/lang/Throwable;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
