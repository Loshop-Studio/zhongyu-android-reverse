.class public final Ls2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/q$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls2/b;->e(Lr2/q;)Lr2/q$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lr2/q;


# direct methods
.method public constructor <init>(Lr2/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls2/b$a;->a:Lr2/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr2/e;)Lr2/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls2/b$a;->a:Lr2/q;

    .line 7
    .line 8
    return-object p1
.end method
