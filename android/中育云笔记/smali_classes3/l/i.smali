.class public final Ll/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll/i$a;
    }
.end annotation


# static fields
.field public static final c:Ll/i$a;

.field public static final d:Ll/i;


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll/i$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll/i;->c:Ll/i$a;

    .line 8
    .line 9
    new-instance v0, Ll/i;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1, v1}, Ll/i;-><init>(ZI)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ll/i;->d:Ll/i;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ll/i;->a:Z

    .line 5
    .line 6
    iput p2, p0, Ll/i;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ll/i;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll/i;->a:Z

    .line 2
    .line 3
    return v0
.end method
