.class public final synthetic Lcom/friday/document/viewmodel/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/model/ShareFile;

    check-cast p2, Lcom/friday/document/model/ShareFile;

    invoke-static {p1, p2}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->g(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
