.class public final synthetic Le7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Le7/f;


# direct methods
.method public synthetic constructor <init>(Le7/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/e;->a:Le7/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Le7/e;->a:Le7/f;

    check-cast p1, Le7/c0;

    invoke-static {v0, p1}, Le7/f;->a(Le7/f;Le7/c0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
