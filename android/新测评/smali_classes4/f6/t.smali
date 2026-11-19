.class public final synthetic Lf6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lf6/j;

.field public final synthetic g:J

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/String;Lf6/j;JLkotlin/jvm/functions/Function1;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/t;->a:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lf6/t;->b:Z

    iput-boolean p3, p0, Lf6/t;->c:Z

    iput-object p4, p0, Lf6/t;->d:Ljava/lang/String;

    iput-object p5, p0, Lf6/t;->e:Ljava/lang/String;

    iput-object p6, p0, Lf6/t;->f:Lf6/j;

    iput-wide p7, p0, Lf6/t;->g:J

    iput-object p9, p0, Lf6/t;->h:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lf6/t;->i:Ljava/lang/String;

    iput p11, p0, Lf6/t;->j:I

    iput p12, p0, Lf6/t;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lf6/t;->a:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lf6/t;->b:Z

    iget-boolean v2, p0, Lf6/t;->c:Z

    iget-object v3, p0, Lf6/t;->d:Ljava/lang/String;

    iget-object v4, p0, Lf6/t;->e:Ljava/lang/String;

    iget-object v5, p0, Lf6/t;->f:Lf6/j;

    iget-wide v6, p0, Lf6/t;->g:J

    iget-object v8, p0, Lf6/t;->h:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lf6/t;->i:Ljava/lang/String;

    iget v10, p0, Lf6/t;->j:I

    iget v11, p0, Lf6/t;->k:I

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lf6/u;->h(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/String;Lf6/j;JLkotlin/jvm/functions/Function1;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
