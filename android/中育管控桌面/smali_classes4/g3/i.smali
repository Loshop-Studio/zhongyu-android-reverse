.class public final synthetic Lg3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:J

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:J

.field public final synthetic j:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/i;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg3/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lg3/i;->c:Ljava/lang/String;

    iput-object p4, p0, Lg3/i;->d:Ljava/lang/String;

    iput-object p5, p0, Lg3/i;->e:Ljava/lang/String;

    iput-wide p6, p0, Lg3/i;->f:J

    iput-object p8, p0, Lg3/i;->g:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lg3/i;->h:Lkotlin/jvm/functions/Function0;

    iput-wide p10, p0, Lg3/i;->i:J

    iput-object p12, p0, Lg3/i;->j:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lg3/i;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg3/i;->b:Ljava/lang/String;

    iget-object v2, p0, Lg3/i;->c:Ljava/lang/String;

    iget-object v3, p0, Lg3/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lg3/i;->e:Ljava/lang/String;

    iget-wide v5, p0, Lg3/i;->f:J

    iget-object v7, p0, Lg3/i;->g:Lkotlin/jvm/functions/Function0;

    iget-object v8, p0, Lg3/i;->h:Lkotlin/jvm/functions/Function0;

    iget-wide v9, p0, Lg3/i;->i:J

    iget-object v11, p0, Lg3/i;->j:Lkotlin/jvm/functions/Function0;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lg3/j;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
