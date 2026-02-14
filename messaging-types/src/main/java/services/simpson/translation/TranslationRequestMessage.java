package services.simpson.translation;

public record TranslationRequestMessage(
        String jobId,
        String title,
        String summary,
        String slug,
        String content,
        String sourceLang,
        String targetLang
) {
}
