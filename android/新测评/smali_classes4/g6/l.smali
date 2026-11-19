.class public final synthetic Lg6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/l;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg6/l;->b:Ljava/lang/String;

    iput-wide p3, p0, Lg6/l;->c:J

    iput-wide p5, p0, Lg6/l;->d:J

    iput-boolean p7, p0, Lg6/l;->e:Z

    iput-object p8, p0, Lg6/l;->f:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lg6/l;->g:I

    iput p10, p0, Lg6/l;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lg6/l;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg6/l;->b:Ljava/lang/String;

    iget-wide v2, p0, Lg6/l;->c:J

    iget-wide v4, p0, Lg6/l;->d:J

    iget-boolean v6, p0, Lg6/l;->e:Z

    iget-object v7, p0, Lg6/l;->f:Lkotlin/jvm/functions/Function0;

    iget v8, p0, Lg6/l;->g:I

    iget v9, p0, Lg6/l;->h:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lg6/m;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
