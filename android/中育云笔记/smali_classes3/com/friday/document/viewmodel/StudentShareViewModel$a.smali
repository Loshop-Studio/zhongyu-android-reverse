.class public final Lcom/friday/document/viewmodel/StudentShareViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/StudentShareViewModel;-><init>(Ls2/b;Ld2/i;Lc2/g2;Lcom/friday/common/dao/ResourceDao;Lcom/friday/document/service/FileManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/friday/document/model/ShareFile;->getUpdateTime()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getUpdateTime()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1}, Luc/b;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
