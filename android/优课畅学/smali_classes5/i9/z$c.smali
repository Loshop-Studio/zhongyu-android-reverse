.class public final Li9/z$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/z$c$a;
    }
.end annotation


# static fields
.field public static final c:Li9/z$c$a;


# instance fields
.field public final a:Li9/v;

.field public final b:Li9/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li9/z$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li9/z$c$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li9/z$c;->c:Li9/z$c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Li9/v;Li9/c0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Li9/z$c;->a:Li9/v;

    .line 4
    iput-object p2, p0, Li9/z$c;->b:Li9/c0;

    return-void
.end method

.method public synthetic constructor <init>(Li9/v;Li9/c0;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li9/z$c;-><init>(Li9/v;Li9/c0;)V

    return-void
.end method


# virtual methods
.method public final a()Li9/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/z$c;->b:Li9/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Li9/v;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/z$c;->a:Li9/v;

    .line 2
    .line 3
    return-object v0
.end method
