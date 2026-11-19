.class final Le3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/h;


# instance fields
.field private final a:Ljava/util/regex/Matcher;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final b:Ljava/lang/CharSequence;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final c:Le3/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/util/regex/Matcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/i;->a:Ljava/util/regex/Matcher;

    iput-object p2, p0, Le3/i;->b:Ljava/lang/CharSequence;

    .line 2
    new-instance p1, Le3/i$a;

    invoke-direct {p1, p0}, Le3/i$a;-><init>(Le3/i;)V

    iput-object p1, p0, Le3/i;->c:Le3/g;

    return-void
.end method

.method public static final synthetic a(Le3/i;)Ljava/util/regex/MatchResult;
    .locals 0

    invoke-direct {p0}, Le3/i;->b()Ljava/util/regex/MatchResult;

    move-result-object p0

    return-object p0
.end method

.method private final b()Ljava/util/regex/MatchResult;
    .locals 1

    iget-object v0, p0, Le3/i;->a:Ljava/util/regex/Matcher;

    return-object v0
.end method


# virtual methods
.method public getValue()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-direct {p0}, Le3/i;->b()Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->group()Ljava/lang/String;

    move-result-object v0

    const-string v1, "matchResult.group()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
