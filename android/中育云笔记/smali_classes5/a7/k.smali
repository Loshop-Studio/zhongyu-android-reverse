.class public final synthetic La7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    check-cast p2, Lcom/luck/picture/lib/entity/LocalMedia;

    invoke-static {p1, p2}, La7/m;->b(Lcom/luck/picture/lib/entity/LocalMedia;Lcom/luck/picture/lib/entity/LocalMedia;)I

    move-result p1

    return p1
.end method
