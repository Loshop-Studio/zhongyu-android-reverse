.class public final synthetic Lg6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/h;->a:Ljava/lang/String;

    iput-object p2, p0, Lg6/h;->b:Ljava/util/List;

    iput-object p3, p0, Lg6/h;->c:Lkotlin/jvm/functions/Function2;

    iput p4, p0, Lg6/h;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lg6/h;->a:Ljava/lang/String;

    iget-object v1, p0, Lg6/h;->b:Ljava/util/List;

    iget-object v2, p0, Lg6/h;->c:Lkotlin/jvm/functions/Function2;

    iget v3, p0, Lg6/h;->d:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lg6/m;->f(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
