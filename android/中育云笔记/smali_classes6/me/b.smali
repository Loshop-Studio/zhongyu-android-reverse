.class public final Lme/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/b$a;,
        Lme/b$b;
    }
.end annotation


# static fields
.field public static final c:Lme/b$a;


# instance fields
.field public final a:Lje/w;

.field public final b:Lje/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lme/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lme/b$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lme/b;->c:Lme/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lje/w;Lje/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lme/b;->a:Lje/w;

    .line 5
    .line 6
    iput-object p2, p0, Lme/b;->b:Lje/y;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lje/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/b;->b:Lje/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lje/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/b;->a:Lje/w;

    .line 2
    .line 3
    return-object v0
.end method
