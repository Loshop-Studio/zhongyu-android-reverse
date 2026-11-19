.class public final Lcom/friday/common/helper/NotePageOrder$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/helper/NotePageOrder;->b(Ljava/util/List;)Ljava/util/List;
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
    .locals 1

    .line 1
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    .line 2
    .line 3
    sget-object v0, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/friday/common/helper/NotePageOrder;->a(Lcom/friday/common/helper/NotePageOrder;Lcom/friday/common/entity/ResourceEntity;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p2, Lcom/friday/common/entity/ResourceEntity;

    .line 14
    .line 15
    invoke-static {v0, p2}, Lcom/friday/common/helper/NotePageOrder;->a(Lcom/friday/common/helper/NotePageOrder;Lcom/friday/common/entity/ResourceEntity;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p1, p2}, Luc/b;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method
