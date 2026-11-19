.class public Lcom/alibaba/fastjson/parser/ParserConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;
    }
.end annotation


# static fields
.field public static final AUTOTYPE_ACCEPT:Ljava/lang/String; = "fastjson.parser.autoTypeAccept"

.field public static final AUTOTYPE_SUPPORT_PROPERTY:Ljava/lang/String; = "fastjson.parser.autoTypeSupport"

.field public static final AUTO_SUPPORT:Z

.field private static final AUTO_TYPE_ACCEPT_LIST:[Ljava/lang/String;

.field public static final DENYS:[Ljava/lang/String;

.field public static final DENYS_INTERNAL:[Ljava/lang/String;

.field public static final DENY_PROPERTY:Ljava/lang/String; = "fastjson.parser.deny"

.field public static final DENY_PROPERTY_INTERNAL:Ljava/lang/String; = "fastjson.parser.deny.internal"

.field private static final INTERNAL_WHITELIST_HASHCODES:[J

.field public static final SAFE_MODE:Z

.field public static final SAFE_MODE_PROPERTY:Ljava/lang/String; = "fastjson.parser.safeMode"

.field private static awtError:Z

.field public static global:Lcom/alibaba/fastjson/parser/ParserConfig;

.field private static guavaError:Z

.field private static jdk8Error:Z

.field private static jodaError:Z


# instance fields
.field private acceptHashCodes:[J

.field private asmEnable:Z

.field protected asmFactory:Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;

.field private volatile autoTypeCheckHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;",
            ">;"
        }
    .end annotation
.end field

.field private autoTypeSupport:Z

.field public compatibleWithJavaBean:Z

.field protected defaultClassLoader:Ljava/lang/ClassLoader;

.field private denyHashCodes:[J

.field private final deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/alibaba/fastjson/util/IdentityHashMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;",
            ">;"
        }
    .end annotation
.end field

.field public final fieldBased:Z

.field private internalDenyHashCodes:[J

.field private jacksonCompatible:Z

.field private final mixInDeserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/alibaba/fastjson/util/IdentityHashMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson/util/IdentityHashMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;",
            ">;>;"
        }
    .end annotation
.end field

.field private modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson/spi/Module;",
            ">;"
        }
    .end annotation
.end field

.field public propertyNamingStrategy:Lcom/alibaba/fastjson/PropertyNamingStrategy;

.field private safeMode:Z

.field public final symbolTable:Lcom/alibaba/fastjson/parser/SymbolTable;

.field private final typeMapping:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "fastjson.parser.deny.internal"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson/util/IOUtils;->getStringProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->splitItemsFormProperty(Ljava/lang/String;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/alibaba/fastjson/parser/ParserConfig;->DENYS_INTERNAL:[Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "fastjson.parser.deny"

    .line 14
    .line 15
    invoke-static {v0}, Lcom/alibaba/fastjson/util/IOUtils;->getStringProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->splitItemsFormProperty(Ljava/lang/String;)[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/alibaba/fastjson/parser/ParserConfig;->DENYS:[Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "fastjson.parser.autoTypeSupport"

    .line 26
    .line 27
    invoke-static {v0}, Lcom/alibaba/fastjson/util/IOUtils;->getStringProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "true"

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sput-boolean v0, Lcom/alibaba/fastjson/parser/ParserConfig;->AUTO_SUPPORT:Z

    .line 38
    .line 39
    const-string v0, "fastjson.parser.safeMode"

    .line 40
    .line 41
    invoke-static {v0}, Lcom/alibaba/fastjson/util/IOUtils;->getStringProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sput-boolean v0, Lcom/alibaba/fastjson/parser/ParserConfig;->SAFE_MODE:Z

    .line 50
    .line 51
    const-string v0, "fastjson.parser.autoTypeAccept"

    .line 52
    .line 53
    invoke-static {v0}, Lcom/alibaba/fastjson/util/IOUtils;->getStringProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->splitItemsFormProperty(Ljava/lang/String;)[Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x0

    .line 62
    if-nez v0, :cond_0

    .line 63
    .line 64
    new-array v0, v1, [Ljava/lang/String;

    .line 65
    .line 66
    :cond_0
    sput-object v0, Lcom/alibaba/fastjson/parser/ParserConfig;->AUTO_TYPE_ACCEPT_LIST:[Ljava/lang/String;

    .line 67
    .line 68
    const/16 v0, 0x39

    .line 69
    .line 70
    new-array v0, v0, [J

    .line 71
    .line 72
    fill-array-data v0, :array_0

    .line 73
    .line 74
    .line 75
    sput-object v0, Lcom/alibaba/fastjson/parser/ParserConfig;->INTERNAL_WHITELIST_HASHCODES:[J

    .line 76
    .line 77
    new-instance v0, Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 78
    .line 79
    invoke-direct {v0}, Lcom/alibaba/fastjson/parser/ParserConfig;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lcom/alibaba/fastjson/parser/ParserConfig;->global:Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 83
    .line 84
    sput-boolean v1, Lcom/alibaba/fastjson/parser/ParserConfig;->awtError:Z

    .line 85
    .line 86
    sput-boolean v1, Lcom/alibaba/fastjson/parser/ParserConfig;->jdk8Error:Z

    .line 87
    .line 88
    sput-boolean v1, Lcom/alibaba/fastjson/parser/ParserConfig;->jodaError:Z

    .line 89
    .line 90
    sput-boolean v1, Lcom/alibaba/fastjson/parser/ParserConfig;->guavaError:Z

    .line 91
    .line 92
    return-void

    .line 93
    :array_0
    .array-data 8
        -0x7d171ecfe948c062L
        -0x79c2d22e17d46127L
        -0x74df7e34c5af42bcL    # -4.397461274202915E-255
        -0x6fffcbe90d753277L    # -1.304612425320331E-231
        -0x6d0dad3c673fd6baL
        -0x61bfb1a7c0dab02cL    # -5.663184347754154E-163
        -0x60d1df049fb65c8fL
        -0x575556d6bb90031cL    # -8.660931078614971E-113
        -0x546472f8c6b73563L    # -1.2596128630232586E-98
        -0x5034ac668c315c09L    # -1.8437248463066885E-78
        -0x4aeeb38feca3bac8L    # -4.515141395732244E-53
        -0x3f01cd4723768217L    # -123691.55384205993
        -0x3a6557b2656b39c0L    # -2.062519066697081E27
        -0x36d2706ed650cc65L    # -3.296140319984399E44
        -0x338dfabc23a18f70L    # -1.8098708904816462E60
        -0x2f18e591eaa9fc3fL    # -5.478753662882175E81
        -0x2ee2d56becc85844L    # -5.533252572810275E82
        -0x2484003e68c96caeL    # -4.9684551070599265E132
        -0x236a7c0ff7833d39L    # -1.0008455900325936E138
        -0x22555ee0135884a2L    # -1.6236380893367258E143
        -0x1f71178b5d90a151L    # -1.3261085623344647E157
        -0x186b0a08232c537bL    # -9.33910802048915E190
        -0x1482b8793b8cc973L    # -6.016157181125066E209
        -0xb5597c6d7fd8326L    # -9.680269230194381E253
        -0x7381064ecdce04aL    # -6.47436122473038E273
        0xd45d6f8c9017faL
        0x6b949ce6c2fe009L
        0x76566c052e83815L
        0x9df9341f0c76702L
        0xb81ba299273d4e6L
        0xd4788669a13ae74L
        0x111d12921c5466daL    # 3.06807714530297E-226
        0x178b0e2dc3ae9fe5L
        0x19dcaf4adc37d6d4L    # 4.21923310396035E-184
        0x1f10a70ee4065963L    # 4.737874920000775E-159
        0x21082dfbf63fbcc1L
        0x24ae2d07fb5d7497L
        0x26c5d923af21e2e1L    # 6.610091059703345E-122
        0x34cc8e52316fa0cbL    # 2.32920267187095E-54
        0x3f64bc3933a6a2dfL    # 0.002531158182325618
        0x42646e60ec7e5189L    # 7.02009533426548E11
        0x44d57a1b1ef53451L    # 4.0568861274459394E23
        0x4a39c6c7acb6aa18L    # 3.7672373999660865E49
        0x4bb3c59964a2fc50L    # 4.848048869469194E56
        0x4f0c3688e8a18f9fL    # 6.231012896022775E72
        0x5449ec9b0280b9efL    # 1.1074768222926346E98
        0x54dc66a59269bae1L    # 6.212002893406516E100
        0x552d9fb02ffc9defL    # 2.0734284478065116E102
        0x557f642131553498L    # 7.030812168447344E103
        0x604d6657082c1ee9L    # 7.883728180658543E155
        0x61d10af54471e5deL    # 1.533482208710523E163
        0x64dc636f343516dcL    # 7.18982986180002E177
        0x73a0be903f2bcbf4L    # 9.36603387325164E248
        0x73fba1e41c4c3553L    # 4.946007966433693E250
        0x7b606f16a261e1e6L    # 1.9550036277967994E286
        0x7f36112f218143b6L    # 6.053149392081782E304
        0x7fe2b8e675da0cefL    # 1.0517778137125186E308
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson/parser/ParserConfig;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p1, v0, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;-><init>(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;Ljava/lang/ClassLoader;Z)V

    return-void
.end method

.method private constructor <init>(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;Ljava/lang/ClassLoader;Z)V
    .locals 5

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lcom/alibaba/fastjson/util/IdentityHashMap;

    invoke-direct {v0}, Lcom/alibaba/fastjson/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 7
    new-instance v0, Lcom/alibaba/fastjson/util/IdentityHashMap;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->mixInDeserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iput-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->typeMapping:Ljava/util/concurrent/ConcurrentMap;

    .line 9
    sget-boolean v0, Lcom/alibaba/fastjson/util/ASMUtils;->IS_ANDROID:Z

    xor-int/2addr v0, v3

    iput-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmEnable:Z

    .line 10
    new-instance v0, Lcom/alibaba/fastjson/parser/SymbolTable;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson/parser/SymbolTable;-><init>(I)V

    iput-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->symbolTable:Lcom/alibaba/fastjson/parser/SymbolTable;

    .line 11
    sget-boolean v0, Lcom/alibaba/fastjson/parser/ParserConfig;->AUTO_SUPPORT:Z

    iput-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->jacksonCompatible:Z

    .line 13
    sget-boolean v1, Lcom/alibaba/fastjson/util/TypeUtils;->compatibleWithJavaBean:Z

    iput-boolean v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->compatibleWithJavaBean:Z

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->modules:Ljava/util/List;

    .line 15
    sget-boolean v1, Lcom/alibaba/fastjson/parser/ParserConfig;->SAFE_MODE:Z

    iput-boolean v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->safeMode:Z

    const/16 v1, 0x88

    .line 16
    new-array v1, v1, [J

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->denyHashCodes:[J

    .line 17
    sget-object v1, Lcom/alibaba/fastjson/parser/ParserConfig;->AUTO_TYPE_ACCEPT_LIST:[Ljava/lang/String;

    array-length v1, v1

    new-array v1, v1, [J

    move v2, v0

    .line 18
    :goto_0
    sget-object v3, Lcom/alibaba/fastjson/parser/ParserConfig;->AUTO_TYPE_ACCEPT_LIST:[Ljava/lang/String;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    .line 19
    aget-object v3, v3, v2

    invoke-static {v3}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    move-result-wide v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->sort([J)V

    .line 21
    iput-object v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->acceptHashCodes:[J

    .line 22
    iput-boolean p3, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->fieldBased:Z

    if-nez p1, :cond_2

    .line 23
    sget-boolean p3, Lcom/alibaba/fastjson/util/ASMUtils;->IS_ANDROID:Z

    if-nez p3, :cond_2

    if-nez p2, :cond_1

    .line 24
    :try_start_0
    new-instance p2, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;

    new-instance p3, Lcom/alibaba/fastjson/util/ASMClassLoader;

    invoke-direct {p3}, Lcom/alibaba/fastjson/util/ASMClassLoader;-><init>()V

    invoke-direct {p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;-><init>(Ljava/lang/ClassLoader;)V

    move-object p1, p2

    goto :goto_1

    .line 25
    :cond_1
    new-instance p3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;

    invoke-direct {p3, p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;-><init>(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, p3

    .line 26
    :catch_0
    :cond_2
    :goto_1
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmFactory:Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;

    if-nez p1, :cond_3

    .line 27
    iput-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmEnable:Z

    .line 28
    :cond_3
    invoke-direct {p0}, Lcom/alibaba/fastjson/parser/ParserConfig;->initDeserializers()V

    .line 29
    sget-object p1, Lcom/alibaba/fastjson/parser/ParserConfig;->DENYS:[Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->addItemsToDeny([Ljava/lang/String;)V

    .line 30
    sget-object p1, Lcom/alibaba/fastjson/parser/ParserConfig;->DENYS_INTERNAL:[Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->addItemsToDeny0([Ljava/lang/String;)V

    .line 31
    sget-object p1, Lcom/alibaba/fastjson/parser/ParserConfig;->AUTO_TYPE_ACCEPT_LIST:[Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->addItemsToAccept([Ljava/lang/String;)V

    return-void

    :array_0
    .array-data 8
        -0x7f2f38f433d015feL    # -9.556794763479643E-305
        -0x7903d40641508511L    # -5.085553800937495E-275
        -0x780ad5e4f815cc5aL
        -0x71522bf34d56bbbdL
        -0x708a0605f20fc080L    # -3.455901468587826E-234
        -0x6e8d5ac0ea86cf51L
        -0x6dedd28ef1c9b048L    # -1.257180119856368E-221
        -0x6be79918c4100b37L    # -7.248495544345653E-212
        -0x6bcfa3d9a7f08c3bL    # -1.943861383644949E-211
        -0x6bc886d7ce2082c1L
        -0x5edc59d06ce874e0L    # -4.802155510082355E-149
        -0x57a77d31efbb3bb0L
        -0x55c250024ef3b6c9L
        -0x5555f7d9b785c8c9L
        -0x539d9d0ad36755c7L    # -6.886391444241167E-95
        -0x526c85bb67ce1760L    # -3.824696155682281E-89
        -0x51af25e0529f5f6aL    # -1.3554199460470375E-85
        -0x5000b36a4665ccb3L    # -1.6894051133204177E-77
        -0x4bf0cbe38b9136b1L    # -6.213767217225293E-58
        -0x4817128a80a2ec5eL    # -2.2892361373052172E-39
        -0x467494ac696cd017L    # -1.6898413909066546E-31
        -0x4322623ed8990f32L    # -1.644030941651994E-15
        -0x41458d04e3345bdaL    # -1.5764918430089148E-6
        -0x3ff41e21450d7f75L    # -3.485288105512216
        -0x3ef795051cd19da8L    # -200031.3609283145
        -0x3d99b2f6a71301b4L    # -7.662539098639468E11
        -0x3be00836378383fbL    # -1.4742602222991634E20
        -0x399b4c9c4535faf6L    # -1.3120653062289765E31
        -0x38a661401c18dbfaL    # -5.3210898116926836E35
        -0x372b61a9fe199e57L    # -7.184498624325357E42
        -0x369c96af7d028d72L    # -3.463106763999075E45
        -0x2e10320b4cce92ccL    # -4.9428513655242083E86
        -0x2ab46e33884dc613L    # -7.718587662525667E102
        -0x2a6116e0f4f615ffL    # -2.769276834562512E104
        -0x299097546d18010bL    # -2.305158249887012E108
        -0x2735c2a6a167d454L    # -5.293540616952125E119
        -0x232729ea59bb61c2L    # -1.8485208306343955E139
        -0x21dc5f7f6574642aL    # -3.063522061072579E145
        -0x2103df70dc82befcL    # -3.5965336067206575E149
        -0x20d2200cef324c8bL    # -3.0559968239287952E150
        -0x1f651b9fb7bda7d1L    # -2.3076098125244163E157
        -0x1e6e67fb2a40b971L    # -9.894137060283861E161
        -0x1d14c5381a93b982L    # -3.211360471030518E168
        -0x19fc295ae05296d5L    # -2.6342395696172524E183
        -0x16e7b41aa4e269d6L    # -1.816185970555075E198
        -0x160df452da09f7f9L    # -2.2100835374064227E202
        -0xd67c2f662d64b89L    # -1.0343819992267985E244
        -0xc8fd5b5ab6f4718L
        -0xb8b1bbae70d98caL    # -9.573036758577548E252
        -0x816918b205a7244L
        -0x388c51df37d896fL
        -0x30c1879bb467428L    # -7.945197787260532E293
        -0x2a4039effa928e0L    # -7.14947811210233E295
        -0x5ea40fde0e1c84L
        -0x22e57f0e12cbfbL
        0x10e067cd55c5e5L
        0x761619136cc13eL
        0x22baa234c5bfb8aL
        0x3085068cb7201b8L
        0x45b11bc78a3aba3L
        0x55cfca0f2281c07L
        0xb6e292fa5955adeL
        0xee6511b66fd5ef0L    # 6.854342740564376E-237
        0x100150a253996624L    # 1.394104277479804E-231
        0x10b2bdca849d9b3eL    # 3.09032861507223E-228
        0x10dbc48446e0dae5L
        0x144277b467723158L    # 4.388573993986807E-211
        0x14db2e6fead04af0L    # 3.307156557815155E-208
        0x154b6cb22d294cfaL    # 4.271035506616844E-206
        0x17924cca5227622aL
        0x193b2697eaaed41aL    # 3.9000001662652114E-187
        0x1cd6f11c6a358bb7L    # 9.498405308272427E-170
        0x1e0a8c3358ff3daeL    # 5.762601583556236E-164
        0x24652ce717e713bbL
        0x24d2f6048fef4e49L
        0x24ec99d5e7dc5571L    # 8.058828264835688E-131
        0x25e962f1c28f71a2L
        0x275d0732b877af29L
        0x28ac82e44e933606L
        0x2ad1ce3a112f015dL
        0x2adfefbbfe29d931L
        0x2b3a37467a344cdfL
        0x2b6dd8b3229d6837L    # 1.7057077092413725E-99
        0x2d308dbbc851b0d8L    # 5.078962391870398E-91
        0x2fe950d3ea52ae0dL    # 6.832216944281275E-78
        0x313bb4abd8d4554cL    # 1.56808971921097E-71
        0x327c8ed7c8706905L    # 1.6948389662237084E-65
        0x332f0b5369a18310L
        0x339a3e0b6beebee9L    # 4.0826654570968825E-60
        0x33c64b921f523f2fL    # 2.77486720533494E-59
        0x34a81ee78429fdf1L    # 4.918595094295287E-55
        0x378307cb0111e878L    # 2.730734411398275E-41
        0x3826f4b2380c8b9bL    # 3.373058177088523E-38
        0x398f942e01920cf0L    # 1.9461954727645544E-31
        0x3a31412dbb05c7ffL    # 2.1778372103247874E-28
        0x3adba40367f73264L    # 3.5724737671988184E-25
        0x3b0b51ecbf6db221L    # 2.8248237289442712E-24
        0x42d11a560fc9fba9L    # 7.521924278884664E13
        0x43320dc9d2ae0892L    # 5.08171005500021E15
        0x440e89208f445fb9L    # 7.041042216469549E19
        0x46c808a4b5841f57L    # 9.749252615377375E32
        0x49312bdafb0077d9L    # 3.829330118647328E44
        0x4a3797b30328202cL    # 3.448058737338662E49
        0x4ba3e254e758d70dL    # 2.4377845509161763E56
        0x4bf881e49d37f530L    # 9.614713083096315E57
        0x4cf54eec05e3e818L    # 5.478576021141778E62
        0x4da972745feb30c1L    # 1.339945589251118E66
        0x4ef08c90ff16c675L    # 1.8274816638330285E72
        0x4fd10ddc6d13821fL    # 3.085523505057036E76
        0x527db6b46ce3bcbcL    # 2.3643694017797754E89
        0x535e552d6f9700c1L    # 3.954486474370437E93
        0x5728504a6d454ffcL    # 7.309005913296069E111
        0x599b5c1213a099acL    # 4.521565120980506E123
        0x5a5bd85c072e5efeL
        0x5ab0cb3071ab40d1L    # 7.275532043244496E128
        0x5b6149820275ea42L
        0x5d74d3e5b9370476L    # 1.5873759122766088E142
        0x5d92e6ddde40ed84L    # 5.762376793011253E142
        0x5f215622fb630753L    # 1.773407570959078E150
        0x61c5bdd721385107L    # 9.781342160839794E162
        0x62db241274397c34L
        0x63a220e60a17c7b9L    # 8.757288450874107E171
        0x647ab0224e149ebeL    # 1.0561215288164044E176
        0x65f81b84c1d920cdL    # 1.6005507777082922E183
        0x665c53c311193973L    # 1.2036519694555594E185
        0x6749835432e0f0d2L
        0x69b6e0175084b377L    # 1.750995289311963E201
        0x6a47501ebb2afdb2L    # 9.136601149026956E203
        0x6fcabf6fa54cafffL    # 3.244253068846464E230
        0x746bd4a53ec195fbL    # 6.376313675246868E252
        0x74b50bb9260e31ffL    # 1.5429848812177576E254
        0x75cc60f5871d0fd3L    # 2.7270901325332595E259
        0x767a586a5107feefL    # 5.184902282980218E262
        0x7aa7ee3627a19cf3L    # 6.950210684357695E282
        0x7ed9311d28bf1a65L    # 1.0797314149657436E303
        0x7ed9481d28bf417aL    # 1.0835821490243428E303
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, p1, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;-><init>(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;Ljava/lang/ClassLoader;Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, v0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;-><init>(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;Ljava/lang/ClassLoader;Z)V

    return-void
.end method

.method private addItemsToAccept([Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    array-length v1, p1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    aget-object v1, p1, v0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->addAccept(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    :goto_1
    return-void
.end method

.method private addItemsToDeny([Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    array-length v1, p1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    aget-object v1, p1, v0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->addDeny(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    :goto_1
    return-void
.end method

.method private addItemsToDeny0([Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    array-length v1, p1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    aget-object v1, p1, v0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->addDenyInternal(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    :goto_1
    return-void
.end method

.method private static getEnumCreator(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    array-length v3, v3

    .line 32
    const/4 v4, 0x1

    .line 33
    if-ne v3, v4, :cond_0

    .line 34
    .line 35
    const-class v3, Lcom/alibaba/fastjson/annotation/JSONCreator;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lcom/alibaba/fastjson/annotation/JSONCreator;

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public static getFieldFromCache(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;)",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/reflect/Field;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "_"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/reflect/Field;

    .line 31
    .line 32
    :cond_0
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "m_"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/reflect/Field;

    .line 56
    .line 57
    :cond_1
    if-nez v0, :cond_4

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/16 v3, 0x7a

    .line 65
    .line 66
    const/16 v4, 0x61

    .line 67
    .line 68
    if-lt v2, v4, :cond_2

    .line 69
    .line 70
    if-gt v2, v3, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    aget-char v5, v0, v1

    .line 77
    .line 78
    add-int/lit8 v5, v5, -0x20

    .line 79
    .line 80
    int-to-char v5, v5

    .line 81
    aput-char v5, v0, v1

    .line 82
    .line 83
    new-instance v1, Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/lang/reflect/Field;

    .line 93
    .line 94
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    const/4 v5, 0x2

    .line 99
    if-le v1, v5, :cond_4

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-le v6, v5, :cond_4

    .line 111
    .line 112
    if-lt v2, v4, :cond_4

    .line 113
    .line 114
    if-gt v2, v3, :cond_4

    .line 115
    .line 116
    const/16 v2, 0x41

    .line 117
    .line 118
    if-lt v1, v2, :cond_4

    .line 119
    .line 120
    const/16 v2, 0x5a

    .line 121
    .line 122
    if-gt v1, v2, :cond_4

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Ljava/util/Map$Entry;

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {p0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_3

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, Ljava/lang/reflect/Field;

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_4
    return-object v0
.end method

.method public static getGlobalInstance()Lcom/alibaba/fastjson/parser/ParserConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson/parser/ParserConfig;->global:Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method private initDeserializers()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson/serializer/MiscCodec;->instance:Lcom/alibaba/fastjson/serializer/MiscCodec;

    .line 4
    .line 5
    const-class v2, Ljava/text/SimpleDateFormat;

    .line 6
    .line 7
    invoke-virtual {v0, v2, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 11
    .line 12
    const-class v2, Ljava/sql/Timestamp;

    .line 13
    .line 14
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/SqlDateDeserializer;->instance_timestamp:Lcom/alibaba/fastjson/parser/deserializer/SqlDateDeserializer;

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 20
    .line 21
    const-class v2, Ljava/sql/Date;

    .line 22
    .line 23
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/SqlDateDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/SqlDateDeserializer;

    .line 24
    .line 25
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 29
    .line 30
    const-class v2, Ljava/sql/Time;

    .line 31
    .line 32
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/TimeDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/TimeDeserializer;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 38
    .line 39
    const-class v2, Ljava/util/Date;

    .line 40
    .line 41
    sget-object v3, Lcom/alibaba/fastjson/serializer/DateCodec;->instance:Lcom/alibaba/fastjson/serializer/DateCodec;

    .line 42
    .line 43
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 47
    .line 48
    sget-object v2, Lcom/alibaba/fastjson/serializer/CalendarCodec;->instance:Lcom/alibaba/fastjson/serializer/CalendarCodec;

    .line 49
    .line 50
    const-class v3, Ljava/util/Calendar;

    .line 51
    .line 52
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 56
    .line 57
    const-class v3, Ljavax/xml/datatype/XMLGregorianCalendar;

    .line 58
    .line 59
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 63
    .line 64
    const-class v2, Lcom/alibaba/fastjson/JSONObject;

    .line 65
    .line 66
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 67
    .line 68
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 72
    .line 73
    sget-object v2, Lcom/alibaba/fastjson/serializer/CollectionCodec;->instance:Lcom/alibaba/fastjson/serializer/CollectionCodec;

    .line 74
    .line 75
    const-class v3, Lcom/alibaba/fastjson/JSONArray;

    .line 76
    .line 77
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 81
    .line 82
    const-class v3, Ljava/util/Map;

    .line 83
    .line 84
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 85
    .line 86
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 90
    .line 91
    const-class v3, Ljava/util/HashMap;

    .line 92
    .line 93
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 94
    .line 95
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 99
    .line 100
    const-class v3, Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 103
    .line 104
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 108
    .line 109
    const-class v3, Ljava/util/TreeMap;

    .line 110
    .line 111
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 112
    .line 113
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 117
    .line 118
    const-class v3, Ljava/util/concurrent/ConcurrentMap;

    .line 119
    .line 120
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 121
    .line 122
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 126
    .line 127
    const-class v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 128
    .line 129
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 130
    .line 131
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 135
    .line 136
    const-class v3, Ljava/util/Collection;

    .line 137
    .line 138
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 142
    .line 143
    const-class v3, Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 149
    .line 150
    const-class v3, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 156
    .line 157
    sget-object v2, Lcom/alibaba/fastjson/parser/deserializer/JavaObjectDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/JavaObjectDeserializer;

    .line 158
    .line 159
    const-class v3, Ljava/lang/Object;

    .line 160
    .line 161
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 165
    .line 166
    const-class v3, Ljava/lang/String;

    .line 167
    .line 168
    sget-object v4, Lcom/alibaba/fastjson/serializer/StringCodec;->instance:Lcom/alibaba/fastjson/serializer/StringCodec;

    .line 169
    .line 170
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 174
    .line 175
    const-class v3, Ljava/lang/StringBuffer;

    .line 176
    .line 177
    sget-object v4, Lcom/alibaba/fastjson/serializer/StringCodec;->instance:Lcom/alibaba/fastjson/serializer/StringCodec;

    .line 178
    .line 179
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 183
    .line 184
    const-class v3, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    sget-object v4, Lcom/alibaba/fastjson/serializer/StringCodec;->instance:Lcom/alibaba/fastjson/serializer/StringCodec;

    .line 187
    .line 188
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 192
    .line 193
    sget-object v3, Lcom/alibaba/fastjson/serializer/CharacterCodec;->instance:Lcom/alibaba/fastjson/serializer/CharacterCodec;

    .line 194
    .line 195
    sget-object v4, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 196
    .line 197
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 201
    .line 202
    const-class v4, Ljava/lang/Character;

    .line 203
    .line 204
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 208
    .line 209
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;

    .line 210
    .line 211
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 212
    .line 213
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 217
    .line 218
    const-class v4, Ljava/lang/Byte;

    .line 219
    .line 220
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 224
    .line 225
    sget-object v4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 226
    .line 227
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 231
    .line 232
    const-class v4, Ljava/lang/Short;

    .line 233
    .line 234
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 238
    .line 239
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 240
    .line 241
    sget-object v5, Lcom/alibaba/fastjson/serializer/IntegerCodec;->instance:Lcom/alibaba/fastjson/serializer/IntegerCodec;

    .line 242
    .line 243
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 247
    .line 248
    const-class v4, Ljava/lang/Integer;

    .line 249
    .line 250
    sget-object v5, Lcom/alibaba/fastjson/serializer/IntegerCodec;->instance:Lcom/alibaba/fastjson/serializer/IntegerCodec;

    .line 251
    .line 252
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 256
    .line 257
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 258
    .line 259
    sget-object v5, Lcom/alibaba/fastjson/serializer/LongCodec;->instance:Lcom/alibaba/fastjson/serializer/LongCodec;

    .line 260
    .line 261
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 265
    .line 266
    const-class v4, Ljava/lang/Long;

    .line 267
    .line 268
    sget-object v5, Lcom/alibaba/fastjson/serializer/LongCodec;->instance:Lcom/alibaba/fastjson/serializer/LongCodec;

    .line 269
    .line 270
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 274
    .line 275
    const-class v4, Ljava/math/BigInteger;

    .line 276
    .line 277
    sget-object v5, Lcom/alibaba/fastjson/serializer/BigIntegerCodec;->instance:Lcom/alibaba/fastjson/serializer/BigIntegerCodec;

    .line 278
    .line 279
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 283
    .line 284
    const-class v4, Ljava/math/BigDecimal;

    .line 285
    .line 286
    sget-object v5, Lcom/alibaba/fastjson/serializer/BigDecimalCodec;->instance:Lcom/alibaba/fastjson/serializer/BigDecimalCodec;

    .line 287
    .line 288
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 292
    .line 293
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 294
    .line 295
    sget-object v5, Lcom/alibaba/fastjson/serializer/FloatCodec;->instance:Lcom/alibaba/fastjson/serializer/FloatCodec;

    .line 296
    .line 297
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 301
    .line 302
    const-class v4, Ljava/lang/Float;

    .line 303
    .line 304
    sget-object v5, Lcom/alibaba/fastjson/serializer/FloatCodec;->instance:Lcom/alibaba/fastjson/serializer/FloatCodec;

    .line 305
    .line 306
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 310
    .line 311
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 312
    .line 313
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 317
    .line 318
    const-class v4, Ljava/lang/Double;

    .line 319
    .line 320
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 324
    .line 325
    sget-object v4, Lcom/alibaba/fastjson/serializer/BooleanCodec;->instance:Lcom/alibaba/fastjson/serializer/BooleanCodec;

    .line 326
    .line 327
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 328
    .line 329
    invoke-virtual {v0, v5, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 333
    .line 334
    const-class v5, Ljava/lang/Boolean;

    .line 335
    .line 336
    invoke-virtual {v0, v5, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 340
    .line 341
    const-class v5, Ljava/lang/Class;

    .line 342
    .line 343
    invoke-virtual {v0, v5, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 347
    .line 348
    new-instance v5, Lcom/alibaba/fastjson/serializer/CharArrayCodec;

    .line 349
    .line 350
    invoke-direct {v5}, Lcom/alibaba/fastjson/serializer/CharArrayCodec;-><init>()V

    .line 351
    .line 352
    .line 353
    const-class v6, [C

    .line 354
    .line 355
    invoke-virtual {v0, v6, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 359
    .line 360
    const-class v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 361
    .line 362
    invoke-virtual {v0, v5, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 366
    .line 367
    const-class v4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 368
    .line 369
    sget-object v5, Lcom/alibaba/fastjson/serializer/IntegerCodec;->instance:Lcom/alibaba/fastjson/serializer/IntegerCodec;

    .line 370
    .line 371
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 375
    .line 376
    const-class v4, Ljava/util/concurrent/atomic/AtomicLong;

    .line 377
    .line 378
    sget-object v5, Lcom/alibaba/fastjson/serializer/LongCodec;->instance:Lcom/alibaba/fastjson/serializer/LongCodec;

    .line 379
    .line 380
    invoke-virtual {v0, v4, v5}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 384
    .line 385
    sget-object v4, Lcom/alibaba/fastjson/serializer/ReferenceCodec;->instance:Lcom/alibaba/fastjson/serializer/ReferenceCodec;

    .line 386
    .line 387
    const-class v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 388
    .line 389
    invoke-virtual {v0, v5, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 393
    .line 394
    const-class v5, Ljava/lang/ref/WeakReference;

    .line 395
    .line 396
    invoke-virtual {v0, v5, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 400
    .line 401
    const-class v5, Ljava/lang/ref/SoftReference;

    .line 402
    .line 403
    invoke-virtual {v0, v5, v4}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 407
    .line 408
    const-class v4, Ljava/util/UUID;

    .line 409
    .line 410
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 414
    .line 415
    const-class v4, Ljava/util/TimeZone;

    .line 416
    .line 417
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 421
    .line 422
    const-class v4, Ljava/util/Locale;

    .line 423
    .line 424
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 428
    .line 429
    const-class v4, Ljava/util/Currency;

    .line 430
    .line 431
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 435
    .line 436
    const-class v4, Ljava/net/Inet4Address;

    .line 437
    .line 438
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 442
    .line 443
    const-class v4, Ljava/net/Inet6Address;

    .line 444
    .line 445
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 449
    .line 450
    const-class v4, Ljava/net/InetSocketAddress;

    .line 451
    .line 452
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 456
    .line 457
    const-class v4, Ljava/io/File;

    .line 458
    .line 459
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 463
    .line 464
    const-class v4, Ljava/net/URI;

    .line 465
    .line 466
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 470
    .line 471
    const-class v4, Ljava/net/URL;

    .line 472
    .line 473
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 477
    .line 478
    const-class v4, Ljava/util/regex/Pattern;

    .line 479
    .line 480
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 484
    .line 485
    const-class v4, Ljava/nio/charset/Charset;

    .line 486
    .line 487
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 491
    .line 492
    const-class v4, Lcom/alibaba/fastjson/JSONPath;

    .line 493
    .line 494
    invoke-virtual {v0, v4, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 498
    .line 499
    const-class v1, Ljava/lang/Number;

    .line 500
    .line 501
    invoke-virtual {v0, v1, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 505
    .line 506
    sget-object v1, Lcom/alibaba/fastjson/serializer/AtomicCodec;->instance:Lcom/alibaba/fastjson/serializer/AtomicCodec;

    .line 507
    .line 508
    const-class v3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 509
    .line 510
    invoke-virtual {v0, v3, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 514
    .line 515
    const-class v3, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 516
    .line 517
    invoke-virtual {v0, v3, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 521
    .line 522
    const-class v1, Ljava/lang/StackTraceElement;

    .line 523
    .line 524
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/StackTraceElementDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/StackTraceElementDeserializer;

    .line 525
    .line 526
    invoke-virtual {v0, v1, v3}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 530
    .line 531
    const-class v1, Ljava/io/Serializable;

    .line 532
    .line 533
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 537
    .line 538
    const-class v1, Ljava/lang/Cloneable;

    .line 539
    .line 540
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 544
    .line 545
    const-class v1, Ljava/lang/Comparable;

    .line 546
    .line 547
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 551
    .line 552
    const-class v1, Ljava/io/Closeable;

    .line 553
    .line 554
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 558
    .line 559
    new-instance v1, Lcom/alibaba/fastjson/parser/deserializer/JSONPDeserializer;

    .line 560
    .line 561
    invoke-direct {v1}, Lcom/alibaba/fastjson/parser/deserializer/JSONPDeserializer;-><init>()V

    .line 562
    .line 563
    .line 564
    const-class v2, Lcom/alibaba/fastjson/JSONPObject;

    .line 565
    .line 566
    invoke-virtual {v0, v2, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    return-void
.end method

.method public static isPrimitive2(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const-class v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const-class v0, Ljava/lang/Character;

    .line 12
    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const-class v0, Ljava/lang/Byte;

    .line 16
    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const-class v0, Ljava/lang/Short;

    .line 20
    .line 21
    if-eq p0, v0, :cond_1

    .line 22
    .line 23
    const-class v0, Ljava/lang/Integer;

    .line 24
    .line 25
    if-eq p0, v0, :cond_1

    .line 26
    .line 27
    const-class v0, Ljava/lang/Long;

    .line 28
    .line 29
    if-eq p0, v0, :cond_1

    .line 30
    .line 31
    const-class v0, Ljava/lang/Float;

    .line 32
    .line 33
    if-eq p0, v0, :cond_1

    .line 34
    .line 35
    const-class v0, Ljava/lang/Double;

    .line 36
    .line 37
    if-eq p0, v0, :cond_1

    .line 38
    .line 39
    const-class v0, Ljava/math/BigInteger;

    .line 40
    .line 41
    if-eq p0, v0, :cond_1

    .line 42
    .line 43
    const-class v0, Ljava/math/BigDecimal;

    .line 44
    .line 45
    if-eq p0, v0, :cond_1

    .line 46
    .line 47
    const-class v0, Ljava/lang/String;

    .line 48
    .line 49
    if-eq p0, v0, :cond_1

    .line 50
    .line 51
    const-class v0, Ljava/util/Date;

    .line 52
    .line 53
    if-eq p0, v0, :cond_1

    .line 54
    .line 55
    const-class v0, Ljava/sql/Date;

    .line 56
    .line 57
    if-eq p0, v0, :cond_1

    .line 58
    .line 59
    const-class v0, Ljava/sql/Time;

    .line 60
    .line 61
    if-eq p0, v0, :cond_1

    .line 62
    .line 63
    const-class v0, Ljava/sql/Timestamp;

    .line 64
    .line 65
    if-eq p0, v0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public static parserAllFieldToCache(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-class v1, Ljava/lang/Object;

    .line 38
    .line 39
    if-eq v0, v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->parserAllFieldToCache(Ljava/lang/Class;Ljava/util/Map;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method private static splitItemsFormProperty(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const-string v0, ","

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method


# virtual methods
.method public addAccept(Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->acceptHashCodes:[J

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-ltz p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->acceptHashCodes:[J

    .line 24
    .line 25
    array-length v2, p1

    .line 26
    add-int/lit8 v3, v2, 0x1

    .line 27
    .line 28
    new-array v3, v3, [J

    .line 29
    .line 30
    aput-wide v0, v3, v2

    .line 31
    .line 32
    array-length v0, p1

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {p1, v1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    .line 38
    .line 39
    .line 40
    iput-object v3, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->acceptHashCodes:[J

    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method public addAutoTypeCheckHandler(Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeCheckHandlers:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeCheckHandlers:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public addDeny(Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->denyHashCodes:[J

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-ltz p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->denyHashCodes:[J

    .line 24
    .line 25
    array-length v2, p1

    .line 26
    add-int/lit8 v3, v2, 0x1

    .line 27
    .line 28
    new-array v3, v3, [J

    .line 29
    .line 30
    aput-wide v0, v3, v2

    .line 31
    .line 32
    array-length v0, p1

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {p1, v1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    .line 38
    .line 39
    .line 40
    iput-object v3, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->denyHashCodes:[J

    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method public addDenyInternal(Ljava/lang/String;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->internalDenyHashCodes:[J

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    new-array p1, p1, [J

    .line 21
    .line 22
    aput-wide v0, p1, v2

    .line 23
    .line 24
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->internalDenyHashCodes:[J

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-ltz p1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->internalDenyHashCodes:[J

    .line 35
    .line 36
    array-length v3, p1

    .line 37
    add-int/lit8 v4, v3, 0x1

    .line 38
    .line 39
    new-array v4, v4, [J

    .line 40
    .line 41
    aput-wide v0, v4, v3

    .line 42
    .line 43
    array-length v0, p1

    .line 44
    invoke-static {p1, v2, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    invoke-static {v4}, Ljava/util/Arrays;->sort([J)V

    .line 48
    .line 49
    .line 50
    iput-object v4, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->internalDenyHashCodes:[J

    .line 51
    .line 52
    :cond_3
    :goto_0
    return-void
.end method

.method public checkAutoType(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    sget v1, Lcom/alibaba/fastjson/JSON;->DEFAULT_PARSER_FEATURE:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->checkAutoType(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public checkAutoType(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 3
    sget v0, Lcom/alibaba/fastjson/JSON;->DEFAULT_PARSER_FEATURE:I

    invoke-virtual {p0, p1, p2, v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->checkAutoType(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public checkAutoType(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;I)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const/4 v4, 0x0

    if-nez v0, :cond_0

    return-object v4

    .line 4
    :cond_0
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeCheckHandlers:Ljava/util/List;

    if-eqz v5, :cond_2

    .line 5
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeCheckHandlers:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;

    .line 6
    invoke-interface {v6, v0, v2, v3}, Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;->handler(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object v6

    if-eqz v6, :cond_1

    return-object v6

    .line 7
    :cond_2
    sget-object v5, Lcom/alibaba/fastjson/parser/Feature;->SafeMode:Lcom/alibaba/fastjson/parser/Feature;

    iget v5, v5, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    .line 8
    iget-boolean v6, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->safeMode:Z

    if-nez v6, :cond_2d

    and-int v6, v3, v5

    if-nez v6, :cond_2d

    sget v6, Lcom/alibaba/fastjson/JSON;->DEFAULT_PARSER_FEATURE:I

    and-int/2addr v5, v6

    if-nez v5, :cond_2d

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0xc0

    const-string v7, "autoType is not support. "

    if-ge v5, v6, :cond_2c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x3

    if-lt v5, v6, :cond_2c

    const/4 v5, 0x0

    const/4 v8, 0x1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    move v9, v5

    goto :goto_1

    .line 10
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    move-result-wide v9

    const-wide v11, -0x6f5da0a455dead62L    # -1.514751450580626E-228

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, 0x2d10a5801b9d6136L    # 1.2768618085266423E-91

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, -0x50a795a8e1cfd395L    # -1.2869594668238042E-80

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, -0x12ff8cff584dd83aL    # -1.1341028219519378E217

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, 0x295c4605fd1eaa95L

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, 0x47ef269aadc650b4L    # 3.312520992710671E38

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, 0x6439c4dff712ae8bL    # 6.373467611436065E174

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, -0x1c22678a5d23ad7dL    # -1.1437309411088266E173

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, -0x1d572245fc1961f3L    # -1.8328867399748285E167

    cmp-long v11, v9, v11

    if-eqz v11, :cond_3

    const-wide v11, -0x28cb314b3c162e26L    # -1.2509996135591577E112

    cmp-long v9, v9, v11

    if-nez v9, :cond_5

    goto :goto_0

    :cond_5
    move v9, v8

    :goto_1
    const/16 v10, 0x24

    const/16 v11, 0x2e

    .line 11
    invoke-virtual {v0, v10, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v10

    .line 12
    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v12

    int-to-long v12, v12

    const-wide v14, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    xor-long/2addr v12, v14

    const-wide v16, 0x100000001b3L

    mul-long v12, v12, v16

    const-wide v18, -0x509be9b379fdb0e6L    # -2.1176223865607047E-80

    cmp-long v18, v12, v18

    if-eqz v18, :cond_2b

    .line 13
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v18

    add-int/lit8 v4, v18, -0x1

    invoke-virtual {v10, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move-wide/from16 v20, v14

    int-to-long v14, v4

    xor-long/2addr v12, v14

    mul-long v12, v12, v16

    const-wide v14, 0x9198507b5af98f0L

    cmp-long v4, v12, v14

    if-eqz v4, :cond_2a

    .line 14
    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    int-to-long v12, v4

    xor-long v12, v12, v20

    mul-long v12, v12, v16

    .line 15
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    move-result v4

    int-to-long v14, v4

    xor-long/2addr v12, v14

    mul-long v12, v12, v16

    const/4 v4, 0x2

    .line 16
    invoke-virtual {v10, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    int-to-long v14, v4

    xor-long/2addr v12, v14

    mul-long v12, v12, v16

    .line 17
    invoke-static {v10}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    move-result-wide v14

    .line 18
    sget-object v4, Lcom/alibaba/fastjson/parser/ParserConfig;->INTERNAL_WHITELIST_HASHCODES:[J

    invoke-static {v4, v14, v15}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v4

    if-ltz v4, :cond_6

    move v4, v8

    goto :goto_2

    :cond_6
    move v4, v5

    .line 19
    :goto_2
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->internalDenyHashCodes:[J

    if-eqz v6, :cond_8

    move-wide/from16 v20, v12

    const/4 v6, 0x3

    .line 20
    :goto_3
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v6, v5, :cond_8

    .line 21
    invoke-virtual {v10, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move-wide/from16 v22, v12

    int-to-long v11, v5

    xor-long v11, v20, v11

    mul-long v11, v11, v16

    .line 22
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->internalDenyHashCodes:[J

    invoke-static {v5, v11, v12}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v5

    if-gez v5, :cond_7

    add-int/lit8 v6, v6, 0x1

    move-wide/from16 v20, v11

    move-wide/from16 v12, v22

    const/16 v11, 0x2e

    goto :goto_3

    .line 23
    :cond_7
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_8
    move-wide/from16 v22, v12

    if-nez v4, :cond_9

    .line 24
    iget-boolean v5, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    if-nez v5, :cond_a

    if-eqz v9, :cond_9

    goto :goto_4

    :cond_9
    move/from16 v20, v9

    goto :goto_7

    :cond_a
    :goto_4
    move-wide/from16 v11, v22

    const/4 v5, 0x3

    .line 25
    :goto_5
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_9

    .line 26
    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move/from16 v20, v9

    int-to-long v8, v6

    xor-long/2addr v8, v11

    mul-long v11, v8, v16

    .line 27
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->acceptHashCodes:[J

    invoke-static {v6, v11, v12}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v6

    if-ltz v6, :cond_b

    .line 28
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->defaultClassLoader:Ljava/lang/ClassLoader;

    const/4 v13, 0x1

    invoke-static {v0, v6, v13}, Lcom/alibaba/fastjson/util/TypeUtils;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    move-result-object v6

    if-eqz v6, :cond_b

    return-object v6

    .line 29
    :cond_b
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->denyHashCodes:[J

    invoke-static {v6, v11, v12}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v6

    if-ltz v6, :cond_d

    invoke-static {v0}, Lcom/alibaba/fastjson/util/TypeUtils;->getClassFromMapping(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    if-nez v6, :cond_d

    .line 30
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->acceptHashCodes:[J

    invoke-static {v6, v14, v15}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v6

    if-ltz v6, :cond_c

    goto :goto_6

    .line 31
    :cond_c
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_d
    :goto_6
    add-int/lit8 v5, v5, 0x1

    move/from16 v9, v20

    const/4 v8, 0x1

    goto :goto_5

    .line 32
    :goto_7
    invoke-static {v0}, Lcom/alibaba/fastjson/util/TypeUtils;->getClassFromMapping(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-nez v5, :cond_e

    .line 33
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    invoke-virtual {v5, v0}, Lcom/alibaba/fastjson/util/IdentityHashMap;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    :cond_e
    if-nez v5, :cond_f

    .line 34
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->typeMapping:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    :cond_f
    if-eqz v4, :cond_10

    .line 35
    iget-object v4, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->defaultClassLoader:Ljava/lang/ClassLoader;

    const/4 v13, 0x1

    invoke-static {v0, v4, v13}, Lcom/alibaba/fastjson/util/TypeUtils;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    move-result-object v5

    .line 36
    :cond_10
    const-string v4, " -> "

    const-string v6, "type not match. "

    if-eqz v5, :cond_13

    if-eqz v2, :cond_12

    .line 37
    const-class v3, Ljava/util/HashMap;

    if-eq v5, v3, :cond_12

    .line 38
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_8

    .line 39
    :cond_11
    new-instance v3, Lcom/alibaba/fastjson/JSONException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_12
    :goto_8
    return-object v5

    .line 40
    :cond_13
    iget-boolean v8, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    if-nez v8, :cond_19

    const/4 v8, 0x3

    .line 41
    :goto_9
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v8, v9, :cond_19

    .line 42
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-long v11, v9

    xor-long v11, v22, v11

    mul-long v11, v11, v16

    .line 43
    iget-object v9, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->denyHashCodes:[J

    invoke-static {v9, v11, v12}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v9

    if-gez v9, :cond_18

    .line 44
    iget-object v9, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->acceptHashCodes:[J

    invoke-static {v9, v11, v12}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v9

    if-ltz v9, :cond_17

    .line 45
    iget-object v3, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->defaultClassLoader:Ljava/lang/ClassLoader;

    const/4 v13, 0x1

    invoke-static {v0, v3, v13}, Lcom/alibaba/fastjson/util/TypeUtils;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    move-result-object v3

    if-nez v3, :cond_14

    return-object v2

    :cond_14
    if-eqz v2, :cond_16

    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_a

    .line 47
    :cond_15
    new-instance v3, Lcom/alibaba/fastjson/JSONException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_16
    :goto_a
    return-object v3

    :cond_17
    add-int/lit8 v8, v8, 0x1

    move-wide/from16 v22, v11

    goto :goto_9

    .line 48
    :cond_18
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 49
    :cond_19
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v9, 0x2f

    const/16 v10, 0x2e

    invoke-virtual {v0, v10, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ".class"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 50
    iget-object v9, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->defaultClassLoader:Ljava/lang/ClassLoader;

    if-eqz v9, :cond_1a

    .line 51
    invoke-virtual {v9, v8}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v8

    goto :goto_b

    :catchall_0
    move-exception v0

    const/4 v4, 0x0

    goto :goto_e

    :catch_0
    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v19, 0x0

    goto :goto_f

    .line 52
    :cond_1a
    const-class v9, Lcom/alibaba/fastjson/parser/ParserConfig;

    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_b
    if-eqz v8, :cond_1b

    .line 53
    :try_start_1
    new-instance v9, Lcom/alibaba/fastjson/asm/ClassReader;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v13, 0x1

    :try_start_2
    invoke-direct {v9, v8, v13}, Lcom/alibaba/fastjson/asm/ClassReader;-><init>(Ljava/io/InputStream;Z)V

    .line 54
    new-instance v10, Lcom/alibaba/fastjson/asm/TypeCollector;

    const-string v11, "<clinit>"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v12, 0x0

    :try_start_3
    new-array v14, v12, [Ljava/lang/Class;

    invoke-direct {v10, v11, v14}, Lcom/alibaba/fastjson/asm/TypeCollector;-><init>(Ljava/lang/String;[Ljava/lang/Class;)V

    .line 55
    invoke-virtual {v9, v10}, Lcom/alibaba/fastjson/asm/ClassReader;->accept(Lcom/alibaba/fastjson/asm/TypeCollector;)V

    .line 56
    invoke-virtual {v10}, Lcom/alibaba/fastjson/asm/TypeCollector;->hasJsonType()Z

    move-result v9
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object v4, v8

    goto :goto_e

    :catch_1
    :goto_c
    move-object/from16 v19, v8

    goto :goto_f

    :catch_2
    const/4 v12, 0x0

    goto :goto_c

    :catch_3
    const/4 v12, 0x0

    const/4 v13, 0x1

    goto :goto_c

    :cond_1b
    const/4 v12, 0x0

    const/4 v13, 0x1

    move v9, v12

    .line 57
    :goto_d
    invoke-static {v8}, Lcom/alibaba/fastjson/util/IOUtils;->close(Ljava/io/Closeable;)V

    goto :goto_10

    :goto_e
    invoke-static {v4}, Lcom/alibaba/fastjson/util/IOUtils;->close(Ljava/io/Closeable;)V

    .line 58
    throw v0

    .line 59
    :goto_f
    invoke-static/range {v19 .. v19}, Lcom/alibaba/fastjson/util/IOUtils;->close(Ljava/io/Closeable;)V

    move v9, v12

    .line 60
    :goto_10
    sget-object v8, Lcom/alibaba/fastjson/parser/Feature;->SupportAutoType:Lcom/alibaba/fastjson/parser/Feature;

    iget v8, v8, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    .line 61
    iget-boolean v10, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    if-nez v10, :cond_1d

    and-int/2addr v3, v8

    if-nez v3, :cond_1d

    sget v3, Lcom/alibaba/fastjson/JSON;->DEFAULT_PARSER_FEATURE:I

    and-int/2addr v3, v8

    if-eqz v3, :cond_1c

    goto :goto_11

    :cond_1c
    move v3, v12

    goto :goto_12

    :cond_1d
    :goto_11
    move v3, v13

    :goto_12
    if-nez v3, :cond_1e

    if-nez v9, :cond_1e

    if-eqz v20, :cond_21

    :cond_1e
    if-nez v3, :cond_20

    if-eqz v9, :cond_1f

    goto :goto_13

    :cond_1f
    move v5, v12

    goto :goto_14

    :cond_20
    :goto_13
    move v5, v13

    .line 62
    :goto_14
    iget-object v8, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->defaultClassLoader:Ljava/lang/ClassLoader;

    invoke-static {v0, v8, v5}, Lcom/alibaba/fastjson/util/TypeUtils;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    move-result-object v5

    :cond_21
    if-eqz v5, :cond_27

    if-eqz v9, :cond_22

    .line 63
    invoke-static {v0, v5}, Lcom/alibaba/fastjson/util/TypeUtils;->addMapping(Ljava/lang/String;Ljava/lang/Class;)V

    return-object v5

    .line 64
    :cond_22
    const-class v8, Ljava/lang/ClassLoader;

    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_26

    const-class v8, Ljavax/sql/DataSource;

    .line 65
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_26

    const-class v8, Ljavax/sql/RowSet;

    .line 66
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_26

    if-eqz v2, :cond_24

    .line 67
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 68
    invoke-static {v0, v5}, Lcom/alibaba/fastjson/util/TypeUtils;->addMapping(Ljava/lang/String;Ljava/lang/Class;)V

    return-object v5

    .line 69
    :cond_23
    new-instance v3, Lcom/alibaba/fastjson/JSONException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 70
    :cond_24
    iget-object v2, v1, Lcom/alibaba/fastjson/parser/ParserConfig;->propertyNamingStrategy:Lcom/alibaba/fastjson/PropertyNamingStrategy;

    invoke-static {v5, v5, v2}, Lcom/alibaba/fastjson/util/JavaBeanInfo;->build(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/PropertyNamingStrategy;)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-result-object v2

    .line 71
    iget-object v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    if-eqz v2, :cond_27

    if-nez v3, :cond_25

    goto :goto_15

    .line 72
    :cond_25
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 73
    :cond_26
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_27
    :goto_15
    if-eqz v3, :cond_29

    if-eqz v5, :cond_28

    .line 74
    invoke-static {v0, v5}, Lcom/alibaba/fastjson/util/TypeUtils;->addMapping(Ljava/lang/String;Ljava/lang/Class;)V

    :cond_28
    return-object v5

    .line 75
    :cond_29
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 76
    :cond_2a
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 77
    :cond_2b
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 78
    :cond_2c
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 79
    :cond_2d
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "safeMode not support autoType : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public clearDeserializers()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/fastjson/util/IdentityHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/alibaba/fastjson/parser/ParserConfig;->initDeserializers()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public configFromPropety(Ljava/util/Properties;)V
    .locals 1

    .line 1
    const-string v0, "fastjson.parser.deny"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->splitItemsFormProperty(Ljava/lang/String;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->addItemsToDeny([Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "fastjson.parser.autoTypeAccept"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->splitItemsFormProperty(Ljava/lang/String;)[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->addItemsToAccept([Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "fastjson.parser.autoTypeSupport"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "true"

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const-string v0, "false"

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public createFieldDeserializer(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;Lcom/alibaba/fastjson/util/FieldInfo;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;
    .locals 4

    .line 1
    iget-object p2, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->clazz:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {p3}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v1}, Lcom/alibaba/fastjson/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-class v3, Ljava/lang/Void;

    .line 17
    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v1

    .line 22
    :cond_1
    :goto_0
    if-nez v2, :cond_3

    .line 23
    .line 24
    const-class v1, Ljava/util/List;

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const-class v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    if-ne v0, v1, :cond_3

    .line 31
    .line 32
    :cond_2
    new-instance v0, Lcom/alibaba/fastjson/parser/deserializer/ArrayListTypeFieldDeserializer;

    .line 33
    .line 34
    invoke-direct {v0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ArrayListTypeFieldDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    .line 39
    .line 40
    invoke-direct {v0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public createJavaBeanDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmEnable:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->fieldBased:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    xor-int/2addr v1, v2

    .line 7
    and-int/2addr v0, v1

    .line 8
    const-class v1, Ljava/lang/Void;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    const-class v4, Lcom/alibaba/fastjson/annotation/JSONType;

    .line 14
    .line 15
    invoke-static {p1, v4}, Lcom/alibaba/fastjson/util/TypeUtils;->getAnnotation(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Lcom/alibaba/fastjson/annotation/JSONType;

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    invoke-interface {v4}, Lcom/alibaba/fastjson/annotation/JSONType;->deserializer()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    instance-of v5, v0, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    check-cast v0, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    return-object v0

    .line 40
    :catchall_0
    :cond_0
    invoke-interface {v4}, Lcom/alibaba/fastjson/annotation/JSONType;->asm()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v4}, Lcom/alibaba/fastjson/annotation/JSONType;->parseFeatures()[Lcom/alibaba/fastjson/parser/Feature;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    array-length v0, v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    move v0, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v0, v3

    .line 56
    :cond_2
    :goto_0
    if-eqz v0, :cond_5

    .line 57
    .line 58
    invoke-static {p1, v4}, Lcom/alibaba/fastjson/util/JavaBeanInfo;->getBuilderClass(Ljava/lang/Class;Lcom/alibaba/fastjson/annotation/JSONType;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    if-nez v4, :cond_3

    .line 63
    .line 64
    move-object v4, p1

    .line 65
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_4

    .line 74
    .line 75
    move v0, v3

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const-class v5, Ljava/lang/Object;

    .line 82
    .line 83
    if-eq v4, v5, :cond_5

    .line 84
    .line 85
    if-nez v4, :cond_3

    .line 86
    .line 87
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    array-length v4, v4

    .line 92
    if-eqz v4, :cond_6

    .line 93
    .line 94
    move v0, v3

    .line 95
    :cond_6
    if-eqz v0, :cond_7

    .line 96
    .line 97
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmFactory:Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;

    .line 98
    .line 99
    if-eqz v4, :cond_7

    .line 100
    .line 101
    iget-object v4, v4, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->classLoader:Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 102
    .line 103
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson/util/ASMClassLoader;->isExternalClass(Ljava/lang/Class;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_7

    .line 108
    .line 109
    move v0, v3

    .line 110
    :cond_7
    if-eqz v0, :cond_8

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->checkName(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    :cond_8
    if-eqz v0, :cond_14

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_9

    .line 127
    .line 128
    move v0, v3

    .line 129
    :cond_9
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->propertyNamingStrategy:Lcom/alibaba/fastjson/PropertyNamingStrategy;

    .line 130
    .line 131
    sget-boolean v8, Lcom/alibaba/fastjson/util/TypeUtils;->compatibleWithJavaBean:Z

    .line 132
    .line 133
    iget-boolean v9, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->jacksonCompatible:Z

    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    move-object v4, p1

    .line 137
    move-object v5, p2

    .line 138
    invoke-static/range {v4 .. v9}, Lcom/alibaba/fastjson/util/JavaBeanInfo;->build(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/PropertyNamingStrategy;ZZZ)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz v0, :cond_a

    .line 143
    .line 144
    iget-object p2, p1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 145
    .line 146
    array-length p2, p2

    .line 147
    const/16 v6, 0xc8

    .line 148
    .line 149
    if-le p2, v6, :cond_a

    .line 150
    .line 151
    move v0, v3

    .line 152
    :cond_a
    iget-object p2, p1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->defaultConstructor:Ljava/lang/reflect/Constructor;

    .line 153
    .line 154
    if-eqz v0, :cond_b

    .line 155
    .line 156
    if-nez p2, :cond_b

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-nez p2, :cond_b

    .line 163
    .line 164
    move v0, v3

    .line 165
    :cond_b
    iget-object p1, p1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 166
    .line 167
    array-length p2, p1

    .line 168
    move v6, v3

    .line 169
    :goto_2
    if-ge v6, p2, :cond_15

    .line 170
    .line 171
    aget-object v7, p1, v6

    .line 172
    .line 173
    iget-boolean v8, v7, Lcom/alibaba/fastjson/util/FieldInfo;->getOnly:Z

    .line 174
    .line 175
    if-eqz v8, :cond_d

    .line 176
    .line 177
    :cond_c
    :goto_3
    move v0, v3

    .line 178
    goto/16 :goto_4

    .line 179
    .line 180
    :cond_d
    iget-object v8, v7, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 181
    .line 182
    invoke-virtual {v8}, Ljava/lang/Class;->getModifiers()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-nez v9, :cond_e

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_e
    invoke-virtual {v8}, Ljava/lang/Class;->isMemberClass()Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_f

    .line 198
    .line 199
    invoke-virtual {v8}, Ljava/lang/Class;->getModifiers()I

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-nez v9, :cond_f

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_f
    invoke-virtual {v7}, Lcom/alibaba/fastjson/util/FieldInfo;->getMember()Ljava/lang/reflect/Member;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    if-eqz v9, :cond_10

    .line 215
    .line 216
    invoke-virtual {v7}, Lcom/alibaba/fastjson/util/FieldInfo;->getMember()Ljava/lang/reflect/Member;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-interface {v9}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-static {v9}, Lcom/alibaba/fastjson/util/ASMUtils;->checkName(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    if-nez v9, :cond_10

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_10
    invoke-virtual {v7}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    if-eqz v9, :cond_11

    .line 236
    .line 237
    invoke-interface {v9}, Lcom/alibaba/fastjson/annotation/JSONField;->name()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    invoke-static {v10}, Lcom/alibaba/fastjson/util/ASMUtils;->checkName(Ljava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-eqz v10, :cond_c

    .line 246
    .line 247
    invoke-interface {v9}, Lcom/alibaba/fastjson/annotation/JSONField;->format()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-nez v10, :cond_c

    .line 256
    .line 257
    invoke-interface {v9}, Lcom/alibaba/fastjson/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    if-ne v10, v1, :cond_c

    .line 262
    .line 263
    invoke-interface {v9}, Lcom/alibaba/fastjson/annotation/JSONField;->parseFeatures()[Lcom/alibaba/fastjson/parser/Feature;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    array-length v10, v10

    .line 268
    if-nez v10, :cond_c

    .line 269
    .line 270
    invoke-interface {v9}, Lcom/alibaba/fastjson/annotation/JSONField;->unwrapped()Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-nez v9, :cond_c

    .line 275
    .line 276
    :cond_11
    iget-object v7, v7, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 277
    .line 278
    if-eqz v7, :cond_12

    .line 279
    .line 280
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    array-length v7, v7

    .line 285
    if-le v7, v2, :cond_12

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_12
    invoke-virtual {v8}, Ljava/lang/Class;->isEnum()Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    if-eqz v7, :cond_13

    .line 293
    .line 294
    invoke-virtual {p0, v8}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    instance-of v7, v7, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    .line 299
    .line 300
    if-nez v7, :cond_13

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 304
    .line 305
    goto/16 :goto_2

    .line 306
    .line 307
    :cond_14
    move-object v4, p1

    .line 308
    move-object v5, p2

    .line 309
    :cond_15
    :goto_4
    if-eqz v0, :cond_16

    .line 310
    .line 311
    invoke-virtual {v4}, Ljava/lang/Class;->isMemberClass()Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_16

    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-nez p1, :cond_16

    .line 326
    .line 327
    move v0, v3

    .line 328
    :cond_16
    if-eqz v0, :cond_17

    .line 329
    .line 330
    invoke-static {v4}, Lcom/alibaba/fastjson/util/TypeUtils;->isXmlField(Ljava/lang/Class;)Z

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    if-eqz p1, :cond_17

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_17
    move v3, v0

    .line 338
    :goto_5
    if-nez v3, :cond_18

    .line 339
    .line 340
    new-instance p1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 341
    .line 342
    invoke-direct {p1, p0, v4, v5}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    .line 343
    .line 344
    .line 345
    return-object p1

    .line 346
    :cond_18
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->propertyNamingStrategy:Lcom/alibaba/fastjson/PropertyNamingStrategy;

    .line 347
    .line 348
    invoke-static {v4, v5, p1}, Lcom/alibaba/fastjson/util/JavaBeanInfo;->build(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/PropertyNamingStrategy;)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    :try_start_1
    iget-object p2, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmFactory:Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;

    .line 353
    .line 354
    invoke-virtual {p2, p0, p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->createJavaBeanDeserializer(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 355
    .line 356
    .line 357
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/alibaba/fastjson/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 358
    return-object p1

    .line 359
    :catch_0
    move-exception v0

    .line 360
    move-object p1, v0

    .line 361
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    .line 362
    .line 363
    new-instance v0, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    const-string v1, "create asm deserializer error, "

    .line 369
    .line 370
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-direct {p2, v0, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    throw p2

    .line 388
    :catch_1
    new-instance p2, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 389
    .line 390
    invoke-direct {p2, p0, p1}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;)V

    .line 391
    .line 392
    .line 393
    return-object p2

    .line 394
    :catch_2
    new-instance p1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 395
    .line 396
    invoke-direct {p1, p0, v4, v5}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    .line 397
    .line 398
    .line 399
    return-object p1
.end method

.method public get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson/JSON;->getMixInAnnotations(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->mixInDeserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 33
    .line 34
    return-object p1
.end method

.method public getDefaultClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->defaultClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDerializers()Lcom/alibaba/fastjson/util/IdentityHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/alibaba/fastjson/util/IdentityHashMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDeserializer(Lcom/alibaba/fastjson/util/FieldInfo;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 1

    .line 114
    iget-object v0, p1, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    iget-object p1, p1, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    invoke-virtual {p0, v0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object p1

    return-object p1
.end method

.method public getDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 16
    const-string v3, "java.util.Optional"

    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/ParserConfig;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v4

    if-nez v4, :cond_0

    .line 17
    instance-of v5, v2, Lcom/alibaba/fastjson/util/ParameterizedTypeImpl;

    if-eqz v5, :cond_0

    .line 18
    move-object v4, v2

    check-cast v4, Lcom/alibaba/fastjson/util/ParameterizedTypeImpl;

    invoke-static {v4}, Lcom/alibaba/fastjson/TypeReference;->intern(Lcom/alibaba/fastjson/util/ParameterizedTypeImpl;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 19
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v4

    :cond_0
    if-eqz v4, :cond_1

    return-object v4

    :cond_1
    if-nez v2, :cond_2

    move-object v2, v1

    .line 20
    :cond_2
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/ParserConfig;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v4

    if-eqz v4, :cond_3

    return-object v4

    .line 21
    :cond_3
    const-class v5, Lcom/alibaba/fastjson/annotation/JSONType;

    invoke-static {v1, v5}, Lcom/alibaba/fastjson/util/TypeUtils;->getAnnotation(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Lcom/alibaba/fastjson/annotation/JSONType;

    if-eqz v6, :cond_4

    .line 22
    invoke-interface {v6}, Lcom/alibaba/fastjson/annotation/JSONType;->mappingTo()Ljava/lang/Class;

    move-result-object v6

    .line 23
    const-class v7, Ljava/lang/Void;

    if-eq v6, v7, :cond_4

    .line 24
    invoke-virtual {v0, v6, v6}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v1

    return-object v1

    .line 25
    :cond_4
    instance-of v6, v2, Ljava/lang/reflect/WildcardType;

    if-nez v6, :cond_5

    instance-of v6, v2, Ljava/lang/reflect/TypeVariable;

    if-nez v6, :cond_5

    instance-of v6, v2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v6, :cond_6

    .line 26
    :cond_5
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v4

    :cond_6
    if-eqz v4, :cond_7

    return-object v4

    .line 27
    :cond_7
    iget-object v6, v0, Lcom/alibaba/fastjson/parser/ParserConfig;->modules:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/alibaba/fastjson/spi/Module;

    .line 28
    invoke-interface {v4, v0, v1}, Lcom/alibaba/fastjson/spi/Module;->createDeserializer(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 29
    invoke-virtual {v0, v2, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    return-object v4

    .line 30
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x24

    const/16 v8, 0x2e

    .line 31
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    .line 32
    const-string v7, "java.awt."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v7, :cond_c

    .line 33
    invoke-static {v1}, Lcom/alibaba/fastjson/serializer/AwtCodec;->support(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 34
    sget-boolean v7, Lcom/alibaba/fastjson/parser/ParserConfig;->awtError:Z

    if-nez v7, :cond_c

    .line 35
    const-string v4, "java.awt.Rectangle"

    const-string v7, "java.awt.Color"

    const-string v11, "java.awt.Point"

    const-string v12, "java.awt.Font"

    filled-new-array {v11, v12, v4, v7}, [Ljava/lang/String;

    move-result-object v4

    move v7, v9

    :goto_0
    if-ge v7, v8, :cond_b

    .line 36
    :try_start_0
    aget-object v11, v4, v7

    .line 37
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 38
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    sget-object v7, Lcom/alibaba/fastjson/serializer/AwtCodec;->instance:Lcom/alibaba/fastjson/serializer/AwtCodec;

    invoke-virtual {v0, v4, v7}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v7

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 39
    :catchall_0
    sput-boolean v10, Lcom/alibaba/fastjson/parser/ParserConfig;->awtError:Z

    .line 40
    :cond_b
    sget-object v4, Lcom/alibaba/fastjson/serializer/AwtCodec;->instance:Lcom/alibaba/fastjson/serializer/AwtCodec;

    .line 41
    :cond_c
    sget-boolean v7, Lcom/alibaba/fastjson/parser/ParserConfig;->jdk8Error:Z

    if-nez v7, :cond_10

    .line 42
    :try_start_1
    const-string v7, "java.time."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 43
    const-string v11, "java.time.LocalDateTime"

    const-string v12, "java.time.LocalDate"

    const-string v13, "java.time.LocalTime"

    const-string v14, "java.time.ZonedDateTime"

    const-string v15, "java.time.OffsetDateTime"

    const-string v16, "java.time.OffsetTime"

    const-string v17, "java.time.ZoneOffset"

    const-string v18, "java.time.ZoneRegion"

    const-string v19, "java.time.ZoneId"

    const-string v20, "java.time.Period"

    const-string v21, "java.time.Duration"

    const-string v22, "java.time.Instant"

    filled-new-array/range {v11 .. v22}, [Ljava/lang/String;

    move-result-object v3

    move v7, v9

    :goto_1
    const/16 v8, 0xc

    if-ge v7, v8, :cond_10

    .line 44
    aget-object v8, v3, v7

    .line 45
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    .line 46
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/Jdk8DateCodec;->instance:Lcom/alibaba/fastjson/parser/deserializer/Jdk8DateCodec;

    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    return-object v4

    :cond_d
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 47
    :cond_e
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 48
    const-string v7, "java.util.OptionalDouble"

    const-string v11, "java.util.OptionalInt"

    const-string v12, "java.util.OptionalLong"

    filled-new-array {v3, v7, v11, v12}, [Ljava/lang/String;

    move-result-object v3

    move v7, v9

    :goto_2
    if-ge v7, v8, :cond_10

    .line 49
    aget-object v11, v3, v7

    .line 50
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    .line 51
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/OptionalCodec;->instance:Lcom/alibaba/fastjson/parser/deserializer/OptionalCodec;

    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object v4

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 52
    :catchall_1
    sput-boolean v10, Lcom/alibaba/fastjson/parser/ParserConfig;->jdk8Error:Z

    .line 53
    :cond_10
    sget-boolean v3, Lcom/alibaba/fastjson/parser/ParserConfig;->jodaError:Z

    if-nez v3, :cond_12

    .line 54
    :try_start_2
    const-string v3, "org.joda.time."

    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 55
    const-string v11, "org.joda.time.DateTime"

    const-string v12, "org.joda.time.LocalDate"

    const-string v13, "org.joda.time.LocalDateTime"

    const-string v14, "org.joda.time.LocalTime"

    const-string v15, "org.joda.time.Instant"

    const-string v16, "org.joda.time.Period"

    const-string v17, "org.joda.time.Duration"

    const-string v18, "org.joda.time.DateTimeZone"

    const-string v19, "org.joda.time.format.DateTimeFormatter"

    filled-new-array/range {v11 .. v19}, [Ljava/lang/String;

    move-result-object v3

    move v7, v9

    :goto_3
    const/16 v8, 0x9

    if-ge v7, v8, :cond_12

    .line 56
    aget-object v8, v3, v7

    .line 57
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    .line 58
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lcom/alibaba/fastjson/serializer/JodaCodec;->instance:Lcom/alibaba/fastjson/serializer/JodaCodec;

    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-object v4

    :cond_11
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 59
    :catchall_2
    sput-boolean v10, Lcom/alibaba/fastjson/parser/ParserConfig;->jodaError:Z

    .line 60
    :cond_12
    sget-boolean v3, Lcom/alibaba/fastjson/parser/ParserConfig;->guavaError:Z

    if-nez v3, :cond_14

    const-string v3, "com.google.common.collect."

    .line 61
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 62
    :try_start_3
    const-string v3, "com.google.common.collect.HashMultimap"

    const-string v7, "com.google.common.collect.LinkedListMultimap"

    const-string v8, "com.google.common.collect.LinkedHashMultimap"

    const-string v11, "com.google.common.collect.ArrayListMultimap"

    const-string v12, "com.google.common.collect.TreeMultimap"

    filled-new-array {v3, v7, v8, v11, v12}, [Ljava/lang/String;

    move-result-object v3

    move v7, v9

    :goto_4
    const/4 v8, 0x5

    if-ge v7, v8, :cond_14

    .line 63
    aget-object v8, v3, v7

    .line 64
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    .line 65
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lcom/alibaba/fastjson/serializer/GuavaCodec;->instance:Lcom/alibaba/fastjson/serializer/GuavaCodec;

    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    return-object v4

    :cond_13
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 66
    :catch_0
    sput-boolean v10, Lcom/alibaba/fastjson/parser/ParserConfig;->guavaError:Z

    .line 67
    :cond_14
    const-string v3, "java.nio.ByteBuffer"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 68
    sget-object v4, Lcom/alibaba/fastjson/serializer/ByteBufferCodec;->instance:Lcom/alibaba/fastjson/serializer/ByteBufferCodec;

    invoke-virtual {v0, v1, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    .line 69
    :cond_15
    const-string v3, "java.nio.file.Path"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    .line 70
    sget-object v4, Lcom/alibaba/fastjson/serializer/MiscCodec;->instance:Lcom/alibaba/fastjson/serializer/MiscCodec;

    invoke-virtual {v0, v1, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    .line 71
    :cond_16
    const-class v3, Ljava/util/Map$Entry;

    if-ne v1, v3, :cond_17

    .line 72
    sget-object v4, Lcom/alibaba/fastjson/serializer/MiscCodec;->instance:Lcom/alibaba/fastjson/serializer/MiscCodec;

    invoke-virtual {v0, v1, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    .line 73
    :cond_17
    const-string v3, "org.javamoney.moneta.Money"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    .line 74
    sget-object v4, Lcom/alibaba/fastjson/support/moneta/MonetaCodec;->instance:Lcom/alibaba/fastjson/support/moneta/MonetaCodec;

    invoke-virtual {v0, v1, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    .line 75
    :cond_18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 76
    :try_start_4
    const-class v6, Lcom/alibaba/fastjson/parser/deserializer/AutowiredObjectDeserializer;

    invoke-static {v6, v3}, Lcom/alibaba/fastjson/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alibaba/fastjson/parser/deserializer/AutowiredObjectDeserializer;

    .line 77
    invoke-interface {v6}, Lcom/alibaba/fastjson/parser/deserializer/AutowiredObjectDeserializer;->getAutowiredFor()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_19

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/reflect/Type;

    .line 78
    invoke-virtual {v0, v8, v6}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_5

    :catch_1
    :cond_1a
    if-nez v4, :cond_1b

    .line 79
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/ParserConfig;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v4

    :cond_1b
    if-eqz v4, :cond_1c

    return-object v4

    .line 80
    :cond_1c
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v3

    if-eqz v3, :cond_24

    .line 81
    iget-boolean v3, v0, Lcom/alibaba/fastjson/parser/ParserConfig;->jacksonCompatible:Z

    if-eqz v3, :cond_1e

    .line 82
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    .line 83
    array-length v4, v3

    :goto_6
    if-ge v9, v4, :cond_1e

    aget-object v6, v3, v9

    .line 84
    invoke-static {v6}, Lcom/alibaba/fastjson/util/TypeUtils;->isJacksonCreator(Ljava/lang/reflect/Method;)Z

    move-result v6

    if-eqz v6, :cond_1d

    .line 85
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/parser/ParserConfig;->createJavaBeanDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v1

    .line 86
    invoke-virtual {v0, v2, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    return-object v1

    :cond_1d
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 87
    :cond_1e
    invoke-static {v1}, Lcom/alibaba/fastjson/JSON;->getMixInAnnotations(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    if-eqz v3, :cond_1f

    move-object v4, v3

    goto :goto_7

    :cond_1f
    move-object v4, v1

    .line 88
    :goto_7
    invoke-static {v4, v5}, Lcom/alibaba/fastjson/util/TypeUtils;->getAnnotation(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lcom/alibaba/fastjson/annotation/JSONType;

    if-eqz v4, :cond_20

    .line 89
    invoke-interface {v4}, Lcom/alibaba/fastjson/annotation/JSONType;->deserializer()Ljava/lang/Class;

    move-result-object v4

    .line 90
    :try_start_5
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 91
    invoke-virtual {v0, v1, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    return-object v4

    :catchall_3
    :cond_20
    if-eqz v3, :cond_22

    .line 92
    invoke-static {v3, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getEnumCreator(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    if-eqz v3, :cond_21

    .line 93
    :try_start_6
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_8

    :catch_2
    :cond_21
    const/4 v3, 0x0

    goto :goto_8

    .line 94
    :cond_22
    invoke-static {v1, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getEnumCreator(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    :goto_8
    if-eqz v3, :cond_23

    .line 95
    new-instance v2, Lcom/alibaba/fastjson/parser/deserializer/EnumCreatorDeserializer;

    invoke-direct {v2, v3}, Lcom/alibaba/fastjson/parser/deserializer/EnumCreatorDeserializer;-><init>(Ljava/lang/reflect/Method;)V

    .line 96
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    return-object v2

    .line 97
    :cond_23
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getEnumDeserializer(Ljava/lang/Class;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v1

    goto :goto_b

    .line 98
    :cond_24
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_25

    .line 99
    sget-object v1, Lcom/alibaba/fastjson/serializer/ObjectArrayCodec;->instance:Lcom/alibaba/fastjson/serializer/ObjectArrayCodec;

    goto :goto_b

    .line 100
    :cond_25
    const-class v3, Ljava/util/Set;

    if-eq v1, v3, :cond_2c

    const-class v3, Ljava/util/HashSet;

    if-eq v1, v3, :cond_2c

    const-class v3, Ljava/util/Collection;

    if-eq v1, v3, :cond_2c

    const-class v4, Ljava/util/List;

    if-eq v1, v4, :cond_2c

    const-class v4, Ljava/util/ArrayList;

    if-ne v1, v4, :cond_26

    goto :goto_a

    .line 101
    :cond_26
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_27

    .line 102
    sget-object v1, Lcom/alibaba/fastjson/serializer/CollectionCodec;->instance:Lcom/alibaba/fastjson/serializer/CollectionCodec;

    goto :goto_b

    .line 103
    :cond_27
    const-class v3, Ljava/util/Map;

    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 104
    sget-object v1, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    goto :goto_b

    .line 105
    :cond_28
    const-class v3, Ljava/lang/Throwable;

    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_29

    .line 106
    new-instance v3, Lcom/alibaba/fastjson/parser/deserializer/ThrowableDeserializer;

    invoke-direct {v3, v0, v1}, Lcom/alibaba/fastjson/parser/deserializer/ThrowableDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;)V

    :goto_9
    move-object v1, v3

    goto :goto_b

    .line 107
    :cond_29
    const-class v3, Lcom/alibaba/fastjson/parser/deserializer/PropertyProcessable;

    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 108
    new-instance v3, Lcom/alibaba/fastjson/parser/deserializer/PropertyProcessableDeserializer;

    invoke-direct {v3, v1}, Lcom/alibaba/fastjson/parser/deserializer/PropertyProcessableDeserializer;-><init>(Ljava/lang/Class;)V

    goto :goto_9

    .line 109
    :cond_2a
    const-class v3, Ljava/net/InetAddress;

    if-ne v1, v3, :cond_2b

    .line 110
    sget-object v1, Lcom/alibaba/fastjson/serializer/MiscCodec;->instance:Lcom/alibaba/fastjson/serializer/MiscCodec;

    goto :goto_b

    .line 111
    :cond_2b
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/parser/ParserConfig;->createJavaBeanDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v1

    goto :goto_b

    .line 112
    :cond_2c
    :goto_a
    sget-object v1, Lcom/alibaba/fastjson/serializer/CollectionCodec;->instance:Lcom/alibaba/fastjson/serializer/CollectionCodec;

    .line 113
    :goto_b
    invoke-virtual {v0, v2, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    return-object v1
.end method

.method public getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 3
    move-object v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_3

    .line 5
    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 6
    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_2

    .line 7
    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object p1

    return-object p1

    .line 8
    :cond_2
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object p1

    return-object p1

    .line 9
    :cond_3
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_4

    .line 10
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 11
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p1

    .line 12
    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    .line 13
    aget-object p1, p1, v0

    .line 14
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object p1

    return-object p1

    .line 15
    :cond_4
    sget-object p1, Lcom/alibaba/fastjson/parser/deserializer/JavaObjectDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/JavaObjectDeserializer;

    return-object p1
.end method

.method public getDeserializers()Lcom/alibaba/fastjson/util/IdentityHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/alibaba/fastjson/util/IdentityHashMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEnumDeserializer(Ljava/lang/Class;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public varargs initJavaBeanDeserializers([Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    array-length v0, p1

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {p0, v2, v2}, Lcom/alibaba/fastjson/parser/ParserConfig;->createJavaBeanDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson/parser/ParserConfig;->putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V

    .line 18
    .line 19
    .line 20
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    :goto_2
    return-void
.end method

.method public isAsmEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmEnable:Z

    .line 2
    .line 3
    return v0
.end method

.method public isAutoTypeSupport()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    .line 2
    .line 3
    return v0
.end method

.method public isJacksonCompatible()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->jacksonCompatible:Z

    .line 2
    .line 3
    return v0
.end method

.method public isPrimitive(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->isPrimitive2(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public isSafeMode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->safeMode:Z

    .line 2
    .line 3
    return v0
.end method

.method public putDeserializer(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson/JSON;->getMixInAnnotations(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->mixInDeserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/util/IdentityHashMap;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->mixInDeserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 24
    .line 25
    invoke-virtual {v2, p1, v1}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v1, v0, p2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->deserializers:Lcom/alibaba/fastjson/util/IdentityHashMap;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public register(Lcom/alibaba/fastjson/spi/Module;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->modules:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public register(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->typeMapping:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setAsmEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->asmEnable:Z

    .line 2
    .line 3
    return-void
.end method

.method public setAutoTypeSupport(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->autoTypeSupport:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultClassLoader(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->defaultClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-void
.end method

.method public setJacksonCompatible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->jacksonCompatible:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSafeMode(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/ParserConfig;->safeMode:Z

    .line 2
    .line 3
    return-void
.end method
