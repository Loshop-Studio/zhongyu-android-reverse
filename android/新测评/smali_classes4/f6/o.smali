.class public final synthetic Lf6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/o;->a:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-wide p2, p0, Lf6/o;->b:J

    iput-object p4, p0, Lf6/o;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lf6/o;->a:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-wide v1, p0, Lf6/o;->b:J

    iget-object v3, p0, Lf6/o;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lf6/u;->e(Lkotlin/jvm/internal/Ref$ObjectRef;JLjava/lang/String;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
